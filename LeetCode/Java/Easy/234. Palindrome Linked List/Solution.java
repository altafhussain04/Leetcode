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
    public ListNode findmid(ListNode slow, ListNode fast){
        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
        }
        return slow;
    }

    public ListNode revlist(ListNode prev, ListNode curr){

        if(curr==null){
            return prev;
        }

        ListNode forward=curr.next;

        curr.next=prev;
        prev=curr;
        curr=forward;

       ListNode output=revlist(prev, curr);
       return output;
    }



    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode middle=findmid(slow, fast);

        ListNode temp1=head;


        while(temp1.next!=middle){
            temp1=temp1.next;
        }
        temp1.next=null;


        ListNode prev=null;
        ListNode curr=head;
        ListNode list2=revlist(prev, curr);

        ListNode temp2=middle;
        ListNode temp3=list2;

        while(temp2!=null && temp3!=null){

            if(temp2.val!=temp3.val){
                return false;

            }

            temp2=temp2.next;
            temp3=temp3.next;
        }

        return true;





       
        
    }
}