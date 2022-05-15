public class ArrayOutOfBound {
    public static void main(String[] args) {
        int[] myArray = new int[5];

        for(int i = 0; i < 5; i++) {
            myArray[i] = (i + 1) * 10;
        }

        for(int i = 0; i < 6; i++) {
            System.out.println(myArray[i]);
        }
    }
}