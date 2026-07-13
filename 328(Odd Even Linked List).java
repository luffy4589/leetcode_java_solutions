
class Solution {
    public ListNode oddEvenList(ListNode head) {
      if(head == null || head.next == null)  return head;

      ListNode o = head, e = head.next, evenStart = e;
      while(e != null && e.next != null){
        o.next = o.next.next;
        e.next = e.next.next;
        o = o.next;
        e = e.next;
      }
      o.next = evenStart;

      return head;
    }
}
