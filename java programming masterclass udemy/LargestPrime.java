public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    // public static boolean isPrime(int num) {
    // if(num == 0 || num == 1 || num % 2 == 0) {
    // return false;
    // }
    // if(num == 2) {
    // return true;
    // }

    // for(int i = 3; i <= (int)num / 2; i++) {
    // if(num % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return number;

    }
}
