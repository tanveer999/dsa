public class SharedDigit {
    public static void main(String[] args) {
        
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int rem1, rem2, initialNum2 = num2;

        while(num1 > 0) {
            rem1 = num1 % 10;
            num1 = num1 / 10;

            num2 = initialNum2;

            while (num2 > 0) {
                rem2 = num2 % 10;
                num2 = num2 / 10;

                if(rem1 == rem2) {
                    return true;
                }
            }
        }
        return false;
    }
}
