public class LinkedList1 {
    int val;
    LinkedList1 next;
    LinkedList1() {};
    LinkedList1(int val) {
        this.val = val;
    }
    LinkedList1(int val, LinkedList1 next) {
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        // System.out.println("main list " + list);
        printList(list);
        list = insert(list, 1);
        list = insert(list, 2);
        printList(list);
    }

    public static LinkedList1 insert(LinkedList1 list, int val) {
        LinkedList1 head = null;
        LinkedList1 tail = null;
        // System.out.println("list " + list);
        // System.out.println("tail " + tail);
        // System.out.println("head " + head);;
        LinkedList1 new_node = new LinkedList1(val);

        if(head == null) {
            head = new_node;
            tail = new_node;
        } else {
            while(tail.next != null) {
                tail = tail.next;
            }
            tail.next = new_node;
        }
        return head;
    }

    public static void printList(LinkedList1 list) {
        LinkedList1 currentNode = list;

        if(currentNode.next == null) {
            System.out.println("Empty list");
        } else {
            while(currentNode.next != null) {
                System.out.println(currentNode.val);
                currentNode = currentNode.next;
            }
            System.out.println(currentNode.val);
        }


    }
}
