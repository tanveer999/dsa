import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] myArray = {1, 2, 3, 4, 5, 6};

        System.out.println("myArray is " + Arrays.toString(myArray));

        reverse(myArray);

        System.out.println("Reversed array is " + Arrays.toString(myArray));
        int a =1;
    }

    // public static void reverse(int[] myArray) {
    //     int[] reverseArray = new int[myArray.length];
    //     int count = myArray.length - 1;

    //     for(int i = 0; i < myArray.length; i++) {
    //         reverseArray[i] = myArray[count];
    //         count--;
    //     }
    //     System.out.println("inside function\n reverse array is " + Arrays.toString(reverseArray));
    //     myArray = reverseArray;

    //     System.out.println("inside function\n myArray is " + Arrays.toString(myArray));
    // }

    private static void reverse(int[] myArray) {
        int indexCount = myArray.length - 1;
        int mid = myArray.length / 2;
        int temp;

        for(int i = 0; i < mid; i++) {
            temp = myArray[indexCount];
            myArray[indexCount] = myArray[i];
            myArray[i] = temp;

            indexCount--;
        }
    }
}

/*
a = {1, 2, 3, 4, 5, 6}


*/
