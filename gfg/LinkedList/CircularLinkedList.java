package LinkedList;

class Node2 {
    int data;
    Node2 next;

    Node2 (int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        // Node2 head = new Node2(10);
        // Node2 n1 = new Node2(20);
        // Node2 n2 = new Node2(30);
        // Node2 n3 = new Node2(40);

        // head.next = n1;
        // n1.next = n2;
        // n2.next = n3;
        // n3.next = head;

        // printList(head);

        // Node2 head = null;
        // head = insertAtBeginning(40, head);
        // head = insertAtBeginning(30, head);
        // head = insertAtBeginning(20, head);
        // head = insertAtBeginning(10, head);
        // printList(head);

        // Node2 head = null;
        // head = insertAtBeginning1(40, head);
        // head = insertAtBeginning1(30, head);
        // head = insertAtBeginning1(20, head);
        // head = insertAtBeginning1(10, head);
        // printList(head);

        Node2 head = null;
        head = insertAtEnd(10, head);
        head = insertAtEnd(20, head);
        head = insertAtEnd(30, head);
        head = insertAtEnd(40, head);
        // printList(head);

        head = null;
        head = insertAtEnd(10, head);
        head = insertAtEnd(20, head);
        head = insertAtEnd(30, head);
        head = insertAtEnd(40, head);
        // printList(head);

        // head = deleteHead(head);
        // printList(head);

        // head = deleteHead(head);
        // head = deleteHead(head);
        // head = deleteHead(head);
        // head = deleteHead(head);
        // printList(head);

        head = null;
        head =insertAtEnd(10, head);
        // head =insertAtEnd(20, head);
        // head =insertAtEnd(30, head);

        int k = 1;
        head = deleteKthItem(head, k);
        printList(head);

    }

    static Node2 deleteKthItem(Node2 head, int k) {
        
        if(k == 1) {
            return deleteHead1(head);
        }

        int count = 1;
        Node2 current = head;

        while(current.next != head) {
            count++;
            if(count == k) {
                current.next = current.next.next;
                return head;
            }
            current = current.next;
        }
        return head;
    }

    // O(1)
    static Node2 deleteHead1(Node2 head){ 
        if(head == null || head.next == head){ 
            return null;
        }

        int temp = head.data;
        head.data = head.next.data;
        head.next.data = temp;

        head.next = head.next.next;
        return head;
    }
    // O(n)
    static Node2 deleteHead(Node2 head) {
        if(head == null || head.next == head) {
            return null;
        }

        Node2 current = head;
        while(current.next != head) {
            current = current.next;
        }

        current.next = head.next;
        return head.next;
    }

    //O(1)
    static Node2 insertAtEnd1(int data, Node2 head) {
        Node2 newNode = new Node2(data);

        if(head == null) {
            newNode.next = newNode;
            return newNode;
        }

        newNode.next = head.next;
        head.next = newNode;

        int temp = head.data;
        head.data = newNode.data;
        newNode.data = temp;

        return newNode;
    }

    //O(n)
    static Node2 insertAtEnd(int data, Node2 head) {
        Node2 newNode = new Node2(data);

        if(head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node2 current = head;

        while(current.next != head) {
            current = current.next;
        }

        newNode.next = head;
        current.next = newNode;
        return head;
    }

    //O(1)
    static Node2 insertAtBeginning1(int data, Node2 head) {
        Node2 newNode = new Node2(data);
        if(head == null) {
            newNode.next = newNode;
            return newNode;
        }

        newNode.next = head.next;
        head.next = newNode;

        int temp = head.data;
        head.data = newNode.data;
        newNode.data = temp;
        return head;
    }

    //O(n)
    static Node2 insertAtBeginning(int data, Node2 head) {
        Node2 newNode = new Node2(data);
        if(head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node2 current = head;
        while(current.next != head) {
            current = current.next;
        }

        newNode.next = head;
        current.next = newNode;
        return newNode;
    }

    static void printList(Node2 head) {
        if(head == null)
            return;
        System.out.print(head.data + " ");
        if(head.next != null){

            Node2 current = head.next;
            while(current != head){
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        System.out.println();

    }
}
