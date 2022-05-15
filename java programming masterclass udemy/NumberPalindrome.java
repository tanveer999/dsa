public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0, remainder;
        if (number < 0) {
            number *= -1;
        }
        int initialNumber = number;
        // System.out.println(number);
        while( number > 0) {
            remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
        if (initialNumber == reverse) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
