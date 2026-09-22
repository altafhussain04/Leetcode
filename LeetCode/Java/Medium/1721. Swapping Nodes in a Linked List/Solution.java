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
    public ListNode swapNodes(ListNode head, int k) {


        if(head==null || head.next==null){
            return head;
        }

        ListNode first=head;
        for(int i=1; i<k; i++){
            first=first.next;
        }


        ListNode second=head;
        ListNode temp=first.next;
        while(temp!=null){
            temp=temp.next;
            second=second.next;

        }


        int swap=first.val;
        first.val=second.val;
        second.val=swap;

        return head;

        
    }
}