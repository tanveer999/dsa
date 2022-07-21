package Matrix;

public class BoundaryTraversal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(arr);
    }

    static void print(int[][] arr) {
        int i;
        if(arr.length == 1) {
            for(i = 0; i < arr[0].length; i++) {
                System.out.print(arr[0][i] + " ");
            }
        } else if(arr[0].length == 1) {
            for(i = 0; i < arr.length; i++) {
                System.out.print(arr[i][0] + " ");
            }
        } else {
            for(i = 0; i < arr[0].length; i++) {
                System.out.print(arr[0][i] + " ");
            }

            for(i = 1; i < arr.length; i++) {
                System.out.print(arr[i][arr[0].length - 1] + " ");
            }

            for(i = arr[0].length - 2; i >= 0; i--) {
                System.out.print(arr[arr.length - 1][i] + " ");
            }

            for(i = arr.length - 2; i > 0; i--) {
                System.out.print(arr[i][0] + " ");
            }
        }
    }
}
