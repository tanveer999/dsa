import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        // inputThenPrintSumAndAverage();
        System.out.println(0.0/0);
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        long avg = 0;
        // while(scanner.hasNextInt()) {
        // number = scanner.nextInt();
        // sum += number;
        // count++;
        // }

        while (true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            } else {
                break;
            }
        }

        // if (count > 0) {
            avg = Math.round((double)sum / count);
        // }

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
