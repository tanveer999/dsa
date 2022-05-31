package recursion;

public class Practice {
    public static void main(String[] args) {
        int a = 4;
        
        fun(a);
    }

    public static void fun(int x) {
        if(x > 0) {
            fun(--x);
            System.out.print(x + " ");
            fun(--x);
        }
        // System.out.println(x);
    }
}
