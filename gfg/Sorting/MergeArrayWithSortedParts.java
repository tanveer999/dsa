package Sorting;

import java.util.Arrays;

public class MergeArrayWithSortedParts {
    public static void main(String[] args) {
        // int[] arr = {10, 15, 20, 11, 30};
        int[] arr = {5, 8, 12, 14, 7};
        // int low=0, mid=2, high=4;
        int low=0, mid=3, high=4;
        // arr=mergeArray(arr, low, mid, high);
        // System.out.println(Arrays.toString(arr));
        merge(arr, low, mid, high);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeArray(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        int i = low, j = mid+1, k=0;

        while(i<=mid && j<=high) {
            if(arr[i]<arr[j]) {
                temp[k++]=arr[i++];
            } else {
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid) {
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++];
        }
        return temp;
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] left = new int[mid-low+1];
        int[] right = new int[high-mid];

        for(int i=0;i<left.length;i++){
            left[i]=arr[low+i];
        }
        for(int i=0;i<right.length;i++){
            right[i]=arr[mid+1+i];
        }

        int i=0,j=0,k=low;
        int m=left.length,n=right.length;
        
        while(i<m && j<n){
            if(left[i] < right[j]){
                arr[k++]=left[i++];
            } else {
                arr[k++]=right[j++];
            }
        }
        while(i<m){
            arr[k++]=left[i++];
        }
        while(j<n){
            arr[k++]=right[j++];
        }
    }
}
