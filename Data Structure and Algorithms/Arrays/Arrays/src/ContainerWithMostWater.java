public class ContainerWithMostWater {
    
    public static int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int area = 0;

        while(low < high) {
            int length = Math.min(height[low], height[high]);
            int breadth = high - low;

            int water = length * breadth;

            area = Math.max(area, water);

            if(height[low] < height[high]) {
                low++;
            } else {
                high--;
            }         
        }
        return area;
    }
}
