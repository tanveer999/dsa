public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "aaaa";
        String needle = "bba";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        // if(needle.equals("")) {
        //     return 0;
        // }

        return haystack.indexOf(needle);
    }
}
