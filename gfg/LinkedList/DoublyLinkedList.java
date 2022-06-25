package LinkedList;

class Node1 {
    int data;
    Node1 previous;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        // Node1 head = new Node1(10);
        // Node1 n1 = new Node1(20);
        // Node1 n2 = new Node1(30);

        // head.next = n1;

        // n1.previous = head;
        // n1.next = n2;

        // n2.previous = n1;

        // printList(head);

        // Node1 head = null;
        // head = insertAtBeginning(30, head);
        // head = insertAtBeginning(20, head);
        // head = insertAtBeginning(10, head);
        // printList(head);

        Node1 head = null;
        head = insertAtEnd(10, head);
        head = insertAtEnd(20, head);
        head = insertAtEnd(30, head);
        head = insertAtEnd(40, head);
        printList(head);

        head = reverseDl(head);  
        printList(head);

        // head = null;
        // head = insertAtBeginning(1, head);
        head = deleteHead(head);
        printList(head);

        // head = null;
        // head = insertAtBeginning(1, head);
        head = deleteLastNode(head);
        printList(head);
    }

    static Node1 deleteLastNode(Node1 head) {
        if(head == null || head.next == null) {
            return null;
        }

        Node1 current = head;
        while(current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    static Node1 deleteHead(Node1 head) {
        if(head == null || head.next == null){
            return null;
        }
        head = head.next;
        head.previous = null;
        return head;
    }

    static Node1 reverseDl(Node1 head) {
        Node1 current = head;
        Node1 temp;
        if(head == null)
            return head;
        while(current != null) {
            temp = current.next;
            if(temp == null){
                head = current;
            }
            current.next = current.previous;
            current.previous = temp;
            current = temp;
        }

        return head;
    }

    static Node1 insertAtEnd(int data, Node1 head) {
        Node1 newNode = new Node1(data);
        Node1 current = head;
        if(head == null)
            return newNode;
        
        while(current.next != null)
            current = current.next;

        current.next = newNode;
        newNode.previous = current;
        return head;
    }

    static Node1 insertAtBeginning(int data, Node1 head) {
        Node1 newNode = new Node1(data);
        Node1 current = head;

        if(head == null)
            return newNode;

        newNode.next = current;
        current.previous = newNode;

        return newNode;
    }

    static void printList(Node1 head){
        Node1 current = head;

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
