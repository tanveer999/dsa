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
        int[] temp = {40, 20, 30, 35, 25, 80, 32, 100, 70, 60};
        for(int i = 0; i < temp.length; ++i) {
            heap.arr[i] = temp[i];
            heap.size++;
        }
        // int item = 12;
        // insert(heap, item);   
        minHeapify(heap, 0);
        System.out.println(Arrays.toString(heap.arr));
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int extractMin(Heap heap) {
        if(heap.size == 0) {
            return Integer.MIN_VALUE;
        }

        if(heap.size == 1) {
            heap.size--;
            return heap.arr[0];
        }

        swap(heap.arr, 0, heap.size - 1);
        heap.size--;
        minHeapify(heap, 0);
        return heap.arr[heap.size];
    }

    public static void minHeapify(Heap heap, int index){ 
        int lt = heap.left(index), rt = heap.right(index);
        int smallest = index;

        if(lt < heap.size && heap.arr[lt] < heap.arr[smallest]) {
            smallest = lt;
        }
        if(rt < heap.size && heap.arr[rt] < heap.arr[smallest]) {
            smallest = rt;
        }

        if(smallest != index){
            swap(heap.arr, smallest, index);
            minHeapify(heap, smallest);
        }
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



    

}
