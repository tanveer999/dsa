package Array;

public class SecondMaximumInArray {
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 50, 80, 70, 80, 80, 75};
        System.out.println(findSecondMaximumElement(arr));
    }

    public static int findSecondMaximumElement(int[] arr) {
        int maximum = Integer.MIN_VALUE, secondMaximum=Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maximum) {
                secondMaximum = maximum;
                maximum = arr[i];
            }
            else if(arr[i] > secondMaximum && arr[i] < maximum) {
                secondMaximum = arr[i];
            }
        }
        return secondMaximum;
    }
}
