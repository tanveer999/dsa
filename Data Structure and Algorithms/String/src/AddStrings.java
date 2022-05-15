import java.math.BigInteger;

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "11", num2 = "123";
        System.out.println(addStrings(num1, num2));
    }
    
    // using BigInteger

    public static String addStringsBigInteger(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        BigInteger c = a.add(b);

        return c.toString();
    }

    // using StringBuilder

    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while(i >= 0 || j >= 0 || carry > 0) {
            int n1 = 0;
            int n2 = 0;

            if(i >= 0) {
                n1 = num1.charAt(i) - '0';
                i--;
            }
            if(j >= 0) {
                n2 = num2.charAt(j) - '0';
                j--;
            }

            int sum = (n1 + n2 + carry);
            int num = sum % 10;
            carry = sum >= 10 ? 1: 0;

            sb.append(num);
        }

        return sb.reverse().toString();
    }
}
