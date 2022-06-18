package Strings;

public class CheckStringRotation {
    public static void main(String[] args) {
        // String str1 = "abcd";
        // String str2 = "cdab";
        String str1 = "ABAB";
        String str2 = "ABBA";
        System.out.println(find(str1, str2));
    }

    static boolean find(String str1, String str2) {
        if(str1.length() != str2.length());
        
        String temp = str1 + str1;

        int index = temp.indexOf(str2);
        if(index < 0)
            return false;
        else
            return true;
    }
}
