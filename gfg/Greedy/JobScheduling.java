package Greedy;

import java.util.Arrays;
import java.util.Comparator;

class Job {
    int deadline;
    int profit;

    Job(int deadline, int profit) {
        this.deadline = deadline;
        this.profit = profit;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", deadline, profit);
    }
}

class JobComparator implements Comparator<Job> {
    @Override
    public int compare(Job j1, Job j2) {
        if (j1.deadline != j2.deadline) {
            return j1.deadline - j2.deadline;
        } else {
            return j2.profit - j1.profit;
        }
    }
}

public class JobScheduling {
    public static void main(String[] args) {
        Job[] jobs = new Job[5];
        int[] deadline = { 2, 1, 2, 1, 3 };
        int[] profit = { 100, 50,10, 20, 30 };

        for (int i = 0; i < jobs.length; i++) {
            jobs[i] = new Job(deadline[i], profit[i]);
        }

        System.out.println(findProfit(jobs));
    }

    static int findProfit(Job[] jobs) {
        Arrays.sort(jobs, new JobComparator());
        System.out.println(Arrays.toString(jobs));
        int maxProfit = 0;
        int time = 0;

        for(int i = 0; i < jobs.length; i++) {
            if(jobs[i].deadline > time) {
                maxProfit += jobs[i].profit;
                time++;
            }
        }

        return maxProfit;
    }
}
