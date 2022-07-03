package Stack;

class Stack {
    private int[] arr;
    int top = -1;

    Stack(int size) {
        arr = new int[size];
    }

    public int pop() {
        if(top == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int item = arr[top--];
            return item;
        }
    }

    public void push(int item) {
        if(top == arr.length - 1){
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = item;
        }
         
    }

    public void printStack() {
        if(top == -1)
            System.out.println("Empty stack");
        else {
            for(int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.printStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.printStack();
        // st.push(6);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.printStack();
    }
}
