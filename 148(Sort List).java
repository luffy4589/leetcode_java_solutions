/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
      ArrayList<Integer> a = new ArrayList<>();
      ListNode temp = head;
      while(temp != null){
        a.add(temp.val);
        temp = temp.next;
      }

      Collections.sort(a);
      temp = head;
      for(int num:a){
        temp.val = num;
        temp = temp.next;
      }
      return head;
    }
}
