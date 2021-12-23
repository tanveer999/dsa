public class LinkedList {
    
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void insert(LinkedList list, int data) {
        Node newNode = new Node(data);

        if(list.head == null) {
            list.head = newNode;
        } else {
            Node currentNode = list.head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        // return list;
    }

    public static void printLinkedList(LinkedList list) {
        Node currentNode = list.head;

        if(currentNode == null) {
            System.out.println("No elements in LinkedList");
        } else {
            while(currentNode.next != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
            System.out.println(currentNode.data);
        }
    }

    // method to remove first element
    public static void removeFirst(LinkedList list) {
        Node currentNode = list.head;

        if(currentNode == null) {
            System.out.println("No element");
        } else {
            list.head = currentNode.next;
            currentNode.next = null;
        }
    }

    //method to remove last node
    // not working
    public static LinkedList removeLast(LinkedList list) {
        Node previousNode = null;
        Node currentNode = list.head;

        if(list.head == null) {
            System.out.println("Empty List");
            return list;
        }

        if(list.head.next == null) {
            list.head = null;
        } else {
            while(currentNode != null) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            previousNode.next = null;
            currentNode = null;
        }
        return list;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("Insert");
        insert(list, 1);
        insert(list, 2);
        // insert(list, 3);
        printLinkedList(list);

        // System.out.println("Remove first");
        // removeFirst(list);
        // // removeFirst(list);
        // printLinkedList(list);

        System.out.println("Remove last");
        list = removeLast(list);
        printLinkedList(list);

    }
}
