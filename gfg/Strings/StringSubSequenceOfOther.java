package Strings;

public class StringSubSequenceOfOther {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "AD";
        System.out.println(check(str1, str2));
        System.out.println(recursionCheck(str1, str2, str1.length()-1, str2.length()-1));
    }

    static boolean check(String str1, String str2) {
        int m = 0;
        for(int i = 0 ; i < str1.length() ; i++) {
            if(str1.charAt(i) == str2.charAt(m)) {
                m++;
            }
            if(m == str2.length()) {
                return true;
            }
        }
        return false;
    }

    static boolean recursionCheck(String str1, String str2, int i, int m) {
        if(m == -1) {
            return true;
        }
        if(i == -1) {
            return false; 
        }

        if(str1.charAt(i) == str2.charAt(m)) {
            return recursionCheck(str1,str2,i-1,m-1);
        } else {
            return recursionCheck(str1,str2,i-1,m);
        }
    }
}
