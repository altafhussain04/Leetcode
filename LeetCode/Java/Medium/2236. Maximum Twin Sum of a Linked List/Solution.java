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
    ListNode reverse(ListNode slow){
        ListNode prev=null;
        while(slow!=null){
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
        }
        ListNode head1=reverse(slow);
        ListNode temp=head1;
        ListNode curr=head;
        int sum=Integer.MIN_VALUE;
        while(temp!=null){
              sum=Math.max(sum,curr.val+temp.val);
              curr=curr.next;
              temp=temp.next;
        }
        return sum;
    }
}