public class FlourPackProblem {
    public static void main(String[] args) {
        
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        
        if(bigCount * 5 + smallCount < goal) {
            return false;
        }

        int sum;
        for(int i = 0 ; i <= bigCount; i++) {
            for(int j = 0; j <= smallCount; j++) {
                sum = (i * 5) + (j * 1);
                if(sum == goal) {
                    return true;
                }
            }
        }
        return false;
    }
}
