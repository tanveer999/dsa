
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {this.val = val;}

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class PalindromeLinkedList234 {
    
    public static void main(String[] args) {
        ListNode head = null;
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        printList(head);
        head = recursiveReverse(head, null);

        // head.next = reverse(head.next);
        printList(head);
        System.out.println(new PalindromeLinkedList234().isPalindrome(head));
    }

    static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        if(head.next.next == null) {
            if(head.val == head.next.val) { return true;}
            else {return false;}
        }

        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next =reverse(slow.next);
        fast = slow.next;
        slow = head;

        while(fast != null) {
            if(slow.val != fast.val) { return false; }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
        
    }

    static ListNode reverse(ListNode head) {
        if(head == null) {return head;}

        ListNode curr = head;
        ListNode prev = null;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    static ListNode recursiveReverse(ListNode head, ListNode prev) {
        if(head == null) return prev;

        ListNode next = head.next;
        head.next = prev;
        return recursiveReverse(next, head);
    }
}
