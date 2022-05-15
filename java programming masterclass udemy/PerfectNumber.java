public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(14));
    }

    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }

        int sumOfFactors = 0;

        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sumOfFactors += i;
            }
        }

        // if(sumOfFactors == number) {
        //     return true;
        // }
        // return false;
        return sumOfFactors == number;
    }
}
