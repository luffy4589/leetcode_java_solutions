
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
      if(head==null || head.next==null || k == 0)  return head;
      int n=0;
      ListNode temp=head;
      while(temp.next != null){
        temp = temp.next;
        n++;
      }
      n++;
      k= k%n;
      ListNode t=head;
      for(int i=0;i<(n-k-1);i++){
        t=t.next;
      }

      temp.next = head;
      head = t.next;
      t.next = null;

      return head;
    }
}
