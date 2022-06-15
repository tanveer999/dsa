package Strings;

import java.util.Arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = "welcome to gfg";
        // str = "abc";
        // str = reverseStringWords(str);
        // System.out.println(str);
        // System.out.println(reverseStringWords1(str));
        System.out.println(reverseStringWords2(str));
    }
    static String reverseStringWords2(String str) {
        char[] chArr = str.toCharArray();
        int start = 0;
        for(int i = 0; i < str.length();i++) {
            if(chArr[i] == ' ') {
                reverseCharArray(chArr, start, i - 1);
                start = i + 1;
            }
        }
        reverseCharArray(chArr, start, chArr.length - 1);
        reverseCharArray(chArr, 0, chArr.length - 1);

        return new String(chArr);
    }

    static void reverseCharArray(char[] chArr, int i, int j) {
        while(i < j) {
            swapChArr(chArr, i, j);
            i++;
            j--;
        }
    }

    static void swapChArr(char[] chArr, int i, int j) {
        char temp = chArr[i];
        chArr[i] = chArr[j];
        chArr[j] = temp;
    }

    static String reverseStringWords1(String str) {
        String[] sArr = str.split(" ");
        String s2 = "";
        for(int i = sArr.length - 1; i >= 0; i--) {
            s2 += sArr[i] + " ";
        }
        return s2.trim();
    }

    static String reverseStringWords(String str) {
        String[] sArr = str.split(" ");
        reverse(sArr);
        return String.join(" ", sArr);

    }

    static void reverse(String[] sArr) {
        int i = 0, j = sArr.length - 1;

        while(i < j) {
            swap(sArr, i , j);
            i++;
            j--;
        }
    }
    static void swap(String[] sArr, int i, int j) {
        String temp = sArr[i];
        sArr[i] = sArr[j];
        sArr[j] = temp;
    }
}
