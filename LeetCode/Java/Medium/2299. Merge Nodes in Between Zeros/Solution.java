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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr=head.next;
        ListNode prev=head.next;
        int sum=0;
        if(head==null){
            return head;
        }

        if(head.next==null){
            return head;
        }
        head=head.next;

        while(curr!=null){

            if(curr.val!=0){
                sum+=curr.val;
                curr=curr.next;
            }
            else{
                prev.val=sum;
                prev.next=curr.next;
                prev=curr.next;
                curr=curr.next;
                sum=0;
            }

           

        
        }
         return head;  


       
    }
}