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
    public ListNode oddEvenList(ListNode head) {

        ListNode oddIndex=head;
        ListNode evenIndex=head.next;

        
        ListNode evenin=head.next;

        while(oddIndex.next!=null && evenIndex.next!=null){
            oddIndex.next=oddIndex.next.next;
            oddIndex=oddIndex.next;

            evenIndex.next= evenIndex.next.next;
             evenIndex= evenIndex.next;
        }

        oddIndex.next=evenin;

        return head;
        
    }
}