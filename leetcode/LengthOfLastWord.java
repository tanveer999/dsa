public class LengthOfLastWord {
    public static void main(String[] args) {
        
    }

    static public int lengthOfLastWord(String s) {
        int lastIndex = s.length() - 1;

        for(int i = s.length() - 1; i>=0; i--) {
            if(s.charAt(i) == ' ') continue;
            lastIndex = i;
            break;
        }
        int count = 0;
        for(int i = lastIndex; i >= 0; i--) {
            if(s.charAt(i) == ' ') break;
            count++;
        }
        return count;
    }
}
