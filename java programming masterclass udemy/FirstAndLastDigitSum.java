public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(456));
    }

    public static int sumFirstAndLastDigit(int number) {
        // int initialNumber = number;
        int sum = 0;
        int reverse = 0, remainder;
        if(number < 0) {
            return -1;
        }
        sum += (number % 10);

        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        sum += reverse % 10;

        return sum;
    }
}
