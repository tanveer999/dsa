package Sorting;

//input
// 7,9
// 6,10
// 4,5
// 1,3
// 2,4

import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

class Intervals {
    int start;
    int end;

    @Override
    public String toString() {
        return this.start + "," + this.end;
    }
}

class IntervalsSort implements Comparator<Intervals> {
    public int compare(Intervals a, Intervals b) {
        return a.start - b.start;
    }
}

public class MergeOverlappingIntervals {
    
    public static void main(String[] args) {
        Intervals[] arr = new Intervals[5];
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\D");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Intervals();
            arr[i].start = sc.nextInt();
            arr[i].end = sc.nextInt();
        }
        int index = merge(arr);
        for(int i = 0; i <= index; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }

    public static int merge(Intervals[] arr) {
        Arrays.sort(arr, new IntervalsSort());
        int res = 0;

        for(int i = 1; i<arr.length;i++) {
            if(arr[res].end >= arr[i].start) {
                arr[res].start = Math.min(arr[res].start, arr[i].start);
                arr[res].end = Math.max(arr[res].end, arr[i].end);
            } else {
                res++;
                arr[res] = arr[i];
            }
        }
        return res;
    }
}