package recursion;

public class RopeCuttingProblem {
    public static void main(String[] args) {
        System.out.println(maxPiece(23, 11, 9, 12));
    }

    public static int maxPiece(int n, int a, int b, int c) {
        if(n == 0) return 0;
        if(n < 0) return -1;

        int res = Math.max(maxPiece(n - a, a, b, c), Math.max(maxPiece(n - b, a, b, c), maxPiece(n - c, a, b, c)));

        if(res == -1) return -1;

        return res + 1;
    }
}
