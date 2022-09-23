package LinkedListProblems;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        System.out.println(mergeTwoLists(null, null));
    }

    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = null;
        ListNode curr;

        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val < list2.val) {
            list3 = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            list3 = new ListNode(list2.val);
            list2 = list2.next;
        }

        curr = list3;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                curr.next = new ListNode(list1.val);
                list1 = list1.next;
                curr = curr.next;
            } else {
                curr.next = new ListNode(list2.val);
                list2 = list2.next;
                curr = curr.next;
            }
        }
        while(list1 != null) {
            curr.next = new ListNode(list1.val);
            curr = curr.next;
            list1 = list1.next;
        }
        while(list2 != null) {
            curr.next = new ListNode(list2.val);
            curr = curr.next;
            list2 = list2.next;
        }
        return list3;
    }

    
}
