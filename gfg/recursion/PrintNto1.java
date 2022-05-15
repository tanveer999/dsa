package recursion;

public class PrintNto1 {

    public static void main(String[] args) {
        printNto1(5);
    }

    public static void printNto1(int n) {
        // base condition
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNto1(n - 1);
    }
}