package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10,5,20,15,7};
        // int[] arr = {10};
        mergeSort1(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort1(int[] arr, int low, int high) {
        if(low  < high) {
            int mid = low + ((high-low) / 2);
            mergeSort1(arr, low, mid);
            mergeSort1(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
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
