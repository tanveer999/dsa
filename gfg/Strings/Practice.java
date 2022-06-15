package Strings;

public class Practice {
    public static void main(String[] args) {
        String str = "abcd";

        System.out.println(str.charAt(0)); // a
        System.out.println((int)str.charAt(0)); // 97
        System.out.println((int)'A'); // 65 (note: "A" gives erroe: string cannot be converted to int)
        System.out.println((char)255);
    }
}
