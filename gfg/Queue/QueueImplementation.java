package Queue;

import java.util.Arrays;

class Queue {
    int[] queue;
    int size;
    int capacity;

    Queue(int capacity) {
        this.capacity = capacity;
        size = 0;
        queue = new int[capacity];
    }

    public void enque(int data) {
        queue[size] = data;
        size++;
    }

    public int deque() {
        int item = queue[0];

        for(int i = 1; i < size;i++){
            queue[i - 1] = queue[i];
        }
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public String toString() {
        String output = "";
        for(int i = 0; i < size; i++) {
            output = output + queue[i] + " ";
        }
        return output;
    }
}

public class QueueImplementation {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        System.out.println(q.isEmpty());
        q.enque(1);
        q.enque(2);
        System.out.println(q);
        System.out.println(q.deque());
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.isFull());
    }
}
