import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int sum = 0, prev = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = hm.get(s.charAt(i));

            if (i != 0 && prev < num) {
                sum -= 2 * prev;
            }

            sum += num;
            prev = num;
        }
        return sum;
    }
}
