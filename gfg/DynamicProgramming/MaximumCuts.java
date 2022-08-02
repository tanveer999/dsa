package DynamicProgramming;

public class MaximumCuts {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(solve(n , a, b, c));
    }

    static int solve(int n, int a, int b, int c) {
        if(n == 0) {
            return 0;
        }
        if(n < 0) {
            return -1;
        }

        int res = Math.max(Math.max(solve(n - a, a, b, c), solve(n - b, a, b, c)), solve(n - c, a, b, c));

        if(res == -1) {
            return -1;
        }

        return res + 1;
    }
}
