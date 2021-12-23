public class LinearSearch {
    public static void main(String[] args) {
        int index = linearSearch(new int[] {1, 3, 5, 6}, 6);
        System.out.println(index);
    }

    // function to return index of target element in array
    static int linearSearch(int[] arr, int target) {


        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1; // if element not found
    }
}
