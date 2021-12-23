public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int largestNum = first > second ? first : second;
        int gcd = -1;

        for (int i = (int) (largestNum / 2); i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
                return gcd;
            }
        }
        return gcd;
    }
}
