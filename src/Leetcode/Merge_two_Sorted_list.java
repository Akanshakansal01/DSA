package Leetcode;

public class Merge_two_Sorted_list {
    /*Merge two sorted linked lists and return it as a new sorted list. Example:
    Input: l1 = 1->2->4, l2 = 1->3->4
    Output: 1->1->2->3->4->4
    */
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (true) {
            if (l1 == null) {
                dummy.next = l2;
                break;
            }
            if (l2 == null) {
                dummy.next = l1;
                break;
            }
            if (l1.val <= l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }
        return head.next;
    }
}