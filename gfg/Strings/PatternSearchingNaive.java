package Strings;

public class PatternSearchingNaive {
    public static void main(String[] args) {
        // String str = "geeksforgeeks";
        // String pattern = "eks";
        // pattern = "abc";

        String str = "AAAAA";
        String pattern = "AAA";
        findIndex(str, pattern);
    }

    static void findIndex(String str, String pattern) {
        boolean flag = false;
        for(int i = 0;i < str.length() - pattern.length() + 1; i++) {
            int j = 0;
            if(str.charAt(i) == pattern.charAt(j)) {
                while(j < pattern.length()) {
                    if(str.charAt(i + j) == pattern.charAt(j)) {
                        j++;
                    } else {
                        break;
                    }
                }
            }
            if(j == pattern.length()) {
                flag = true;
                System.out.print(i + " ");
            }
        }
        if(!flag){
            System.out.println("Not present");
        }
        System.out.println();
    }

}
