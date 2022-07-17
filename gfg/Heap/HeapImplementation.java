package Heap;

import java.util.Arrays;

class Heap {
    int[] arr;
    int size;
    int capacity;

    Heap(int capacity) {
        this.arr = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    int left(int index) {
        return (2 * index + 1);
    }

    int right(int index) {
        return (2 * index + 2);
    }

    int parent(int index) {
        return (int)Math.floor((index - 1) / 2);
    }
}

public class HeapImplementation {
    public static void main(String[] args) {
        Heap heap = new Heap(10);
        int[] temp = {10, 20, 15, 40, 50, 100, 25, 45};
        for(int i = 0; i < temp.length; ++i) {
            heap.arr[i] = temp[i];
            heap.size++;
        }
        int item = 12;
        insert(heap, item);   
    }

    public static void insert(Heap heap, int item) {
        if(heap.size == heap.capacity) return;

        heap.size++;
        heap.arr[heap.size - 1] = item;

        int index = heap.size;

        while(item < heap.arr[heap.parent(index)]) {
            swap(heap.arr, heap.parent(index), index);
            index = heap.parent(index);
        }
        System.out.println(Arrays.toString(heap.arr));
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}
