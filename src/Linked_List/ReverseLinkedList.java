package Linked_List;

class ReverseLinkedList {
 public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode (int val) { this.val = val; }
  ListNode (int val, ListNode  next)
  {
       this.val = val;
       this.next = next;
  }

 }

   public ListNode reverseList(ListNode head) {
      ListNode curr = head;
      ListNode pre = null;
      ListNode ahead = null;
      while(curr!=null)
      {
       ahead = curr.next;
       curr.next = pre;
       pre = curr;
       curr = ahead;
      }
      return pre;
   }
}