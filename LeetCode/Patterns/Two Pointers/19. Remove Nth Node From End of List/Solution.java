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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
                               

        }
        int position=count-n;
        int curpos=1;
        curr=head;
        if(position==0){
            return head.next;
        }
        while(curr!=null){
            if(curpos==position){
                curr.next=curr.next.next;

            }
             curpos++;
          
            curr=curr.next;
            
        }

        return head;
        
    }
}