public class NumberToWords {
    public static void main(String[] args) {
        // System.out.println(getDigitCount(0));
        System.out.println(reverse(4));
        numberToWords(4);
    }

    public static int getDigitCount(int number) {
        int digitCount = 0;
        // if (number < 0) {
        //     number *= -1;
        // }
        if(number == 0) {
            digitCount = 1;
        }
        if(number < 0) {
            return -1;
        }
        while(number > 0) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }

    public static int reverse(int number) {
        int remainder, reverse = 0;
        boolean negative = false;
        if (number < 0) {
            number *= -1;
            negative = true;
        }
        // System.out.println(number);
        while(number > 0) {
            remainder = number % 10;
            // System.out.println(remainder);
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return negative ? reverse * -1 : reverse;
    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reverse = reverse(number);
            int remainder;
            int initialReversedNumber = reverse;

            while(reverse > 0) {
                remainder = reverse  % 10;
                reverse /= 10;

                switch(remainder) {
                    case 0: 
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
            if(getDigitCount(number) != getDigitCount(initialReversedNumber)) {
                int count = getDigitCount(number) - getDigitCount(initialReversedNumber);

                for(int i = 0; i < count; i++) {
                    System.out.println("Zero");
                }
            }
            if(initialReversedNumber == 0) {
                System.out.println("Zero");
            }
        }
        
    }

}
