import java.util.Scanner;
import java.util.Arrays;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Enter count");
        int count = readInteger();
        System.out.println("count is " + count);
        System.out.println("enter the elements: ");
        int[] numbers = readElements(count);
        System.out.println("elements are : " + Arrays.toString(numbers));
        System.out.println("min value is " + findMin(numbers));
    }

    private static int readInteger() {
        return scanner.nextInt();
    }

    private static int[] readElements(int count) {
        int[] numbers = new int[count];

        for(int i = 0; i < numbers.length ; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        System.out.println("max int value " + min);
        for(int i = 0; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
}
