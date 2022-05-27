package Array;

public class MininumumConsecutiveFlips {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 0, 1};
        // int[] arr = {1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1};
        // int[] arr = {0, 1};
        // int[] arr = {1, 1, 1};
        minimumFlips1(arr, arr.length);
    }

    public static void minimumFlips1(int[] arr, int n) {
        int zeroCount = 0, oneCount = 0, element, fromIndex = n, toIndex = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 0)
                zeroCount++;
            else
                oneCount++;
        }
        if(zeroCount == n || oneCount == n){ 
            System.out.println("No flips");
            return;
        }
        if(zeroCount < oneCount)
            element = 0;
        else
            element = 1;

        for(int i = 0; i < n; i++) {
            if(arr[i] == element) {
                fromIndex = Math.min(fromIndex, i);
                toIndex = Math.max(toIndex, i);
            } else {
                if(fromIndex != n || toIndex != -1) {
                    System.out.println("From " + fromIndex + " to " + toIndex);
                    fromIndex = n;
                    toIndex = -1;
                }
            }
        }
        if(fromIndex != n || toIndex != -1)
            System.out.println("From " + fromIndex + " to " + toIndex);        
    }
}
