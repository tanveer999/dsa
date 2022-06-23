package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SimpleLinkedList {
    public static void main(String[] args) {
        // Node head = new Node(1);
        // Node n1 = new Node(2);
        // Node n2 = new Node(3);
        // Node n3 = new Node(4);
        // head.next = n1;
        // n1.next = n2;
        // n2.next = n3;

        // // head = null;
        // printList(head);
        // printListRecursive(head);

        // insert at beginning
        Node head = null;
        head = insertAtBeginning(10, head);
        head = insertAtBeginning(20, head);
        head = insertAtBeginning(30, head);
        head = insertAtBeginning(40, head);
        printList(head);

        head = insertAtEnd(50, head);
        printList(head);

        head = DeleteFirstNode(head);
        // head = null;
        printList(head);

        DeleteLastNode(head);
        printList(head);

        head = insertAtGivenPosition(50, 1, head);
        printList(head);

        int key = 60;
        System.out.println(searchNode(head, key));
        System.out.println(searchNodeRecursive(head, key, 1));
    }

    static int searchNodeRecursive(Node current, int key, int count) {
        if(current == null) {
            return -1;
        }

        if(current.data == key) {
            return count;
        }

        return searchNodeRecursive(current.next, key, count + 1);
    }

    static int searchNode(Node head, int key) {
        int count = 0;
        Node current = head;
        while(current != null) {
            count++;
            if(current.data == key) {
                return count;
            }
            current = current.next;
        }
        return -1;
    }

    static void printList(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static void printListRecursive(Node current) {
        if(current == null) {
            System.out.println();
            return;
        }
        System.out.print(current.data + " ");
        printListRecursive(current.next);
    }

    // head in main function and insert function argument is different.
    // changing head in below function does not reflect in the main function.
    // Howere changing value is reflected in main as both references point to same Node.
    static Node insertAtBeginning(int data, Node head) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    static Node insertAtEnd(int data, Node head) {
        Node current = head;
        Node newNode = new Node(data);
        if(current == null) {
            return newNode;
        }
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    static Node DeleteFirstNode(Node head) {
        if(head == null) {
            return null;
        } else {
            return head.next;
        }
    }

    static void DeleteLastNode(Node head) {
        if(head == null) {
            return;
        }
        if(head.next == null)
            return;

        Node current = head;

        while(current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    static Node insertAtGivenPosition(int data, int position, Node head) {
        Node previous = null;
        Node current = head;

        Node newNode = new Node(data);
        if(head == null) {
            return newNode;
        }
        int count = 1;

        if(position == count) {
            newNode.next = head;
            return newNode;
        }

        while(current != null) {
            previous = current;
            current = current.next;
            count++;

            if(count == position) {
                previous.next = newNode;
                newNode.next = current;
            }

        }
        return head;
    }
}
