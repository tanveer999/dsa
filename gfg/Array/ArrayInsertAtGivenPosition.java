package Array;

import java.util.ArrayList;

public class ArrayInsertAtGivenPosition {
    public static void main(String[] args) {
        int element = 20, position = 2;
        int index = position - 1;
        // java array
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 40; 
        arr[3] = 50;
        System.out.println("Length of array: " + arr.length);
        System.out.println("Before insert");
        printArray(arr);
        insertAtGivenIndex(arr, arr.length, element, index);
        printArray(arr);

        System.out.println();
        // ArrayList
        System.out.println("ArrayList");
        ArrayList<Integer> arrList = new ArrayList<>(5);
        System.out.println("Length of array before insert: " + arrList.size());
        arrList.add(10);
        arrList.add(30);
        arrList.add(40);
        arrList.add(50);

        System.out.println("Length of array: " + arrList.size());
        System.out.println("Before insert");
        printArrayList(arrList);

        arrList.add(index, element);

        System.out.println("After insert");
        printArrayList(arrList);

    } 

    // java array
    public static void insertAtGivenIndex(int[] arr, int n, int element, int index) {

        for(int i = n - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = element;
    }

    public static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // ArrayList
    public static void printArrayList(ArrayList<Integer> arrList) {
        for(Integer i: arrList) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


