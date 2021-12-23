public class PainJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double remainingArea = (width * height) - (areaPerBucket * extraBuckets);

        return (int) Math.ceil(remainingArea / areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil((width * height) / areaPerBucket);

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }

}
