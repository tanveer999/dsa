package Java.inputoutput;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerExample {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        method2();
    }

    static void method2() {
        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
    }
    static void method1() {
        // method 1
        String input = sc.nextLine();

        String[] s = input.split("\\s");
        ArrayList<Integer> list = new ArrayList<>();
        for(String str : s) {
            list.add(Integer.parseInt(str));
        }

        System.out.println(list);
    }
}
