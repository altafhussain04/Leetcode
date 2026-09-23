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
    public ListNode partition(ListNode head, int x) {

        ListNode LessHead=new ListNode(-1);
        ListNode LessTail=LessHead;

        ListNode GreatHead=new ListNode(-1);
        ListNode GreatTail=GreatHead;


        ListNode temp=head;

        while(temp!=null){

            if(temp.val<x){
                ListNode insert=temp;

                temp=temp.next;
                LessTail.next=insert;
                LessTail=insert;
                LessTail.next=null;
            }
            else{
                 ListNode insert=temp;

                temp=temp.next;
                GreatTail.next=insert;
                GreatTail=insert;
                GreatTail.next=null;
            }


          

            

        
        }

          LessTail.next=GreatHead.next;
            LessHead=LessHead.next;

            
        return LessHead;



        
    }
}