import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = { -1, 1, 0, -3, 3};
        int[] output = productExceptSelf(arr);

        System.out.println(Arrays.toString(output));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                int temp = 1;
                for (int j = 0; j < nums.length; j++) {
                    if(i == j) {
                        continue;
                    }
                    temp *= nums[j];
                }
                products[i] = temp;
            }
        return products;
    }

    public static int[] productExceptSelf1(int[] nums) {
        int[] products = new int[nums.length];
        // multiply number from left to right
        int leftRunningProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            products[i] = leftRunningProduct;
            leftRunningProduct *= nums[i];
        }

        //multiply number from right to left
        int rightRunningProduct = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            products[i] *= rightRunningProduct;
            rightRunningProduct *= nums[i];
        }
        return products;
    }
}
