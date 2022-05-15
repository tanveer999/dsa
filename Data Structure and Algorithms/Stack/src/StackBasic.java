class Stack {
    int top = -1;
    static final int MAX_SIZE = 5;
    int[] data = new int[MAX_SIZE];

    // Stack() {
    //     top = -1;
    // }

    public void push(int element) {
        if(top >= MAX_SIZE - 1) {
            System.out.println("Stack Overflow");
        } else {
            data[++top] = element;
        }
    }

    public int pop() {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = data[top--];
            return x;
        }
    }

    public void printStack() {
        if(top < 0 ) {
            System.out.println("Stack is empty.");
        }
        for(int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}

public class StackBasic {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.printStack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.printStack();

        System.out.println("After popping elements");
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.printStack();

        s.pop();
        s.pop();
    }
}
