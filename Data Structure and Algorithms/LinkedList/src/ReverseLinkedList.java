public class ReverseLinkedList {
    
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void insertNode(int data, ReverseLinkedList list) {
        Node current = list.head;
        Node newNode = new Node(data);

        if(list.head == null) {
            list.head = newNode;
        } else {
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        // return list;
    }

    static void printList(ReverseLinkedList list) {
        Node current = list.head;
        if(current == null) {
            System.out.println("Empty list");
            return;
        }
        while(current.next != null) {
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println(current.data);
    }

    static void reverseLinkedList(ReverseLinkedList list) {
        if(list.head == null) {
            System.out.println("Empty list");
            return;
        }

        Node previous = null;
        Node next = null;
        Node current = list.head;

        while(current.next != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        next = current.next;
        current.next = previous;
        previous = current;
        current = next;

        list.head = previous;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        printList(list);

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

        insertNode(1, list);
        insertNode(2, list);
        insertNode(3, list);
        insertNode(4, list);
        printList(list);

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        reverseLinkedList(list);
        printList(list);
    }
}
