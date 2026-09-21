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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null){
            return head;
        }
        
        int sizeofList=0;
        ListNode temp=head;
        while(temp!=null){
            sizeofList++;
            temp=temp.next;
        }
        temp=head;
        int rotate=k%sizeofList;

        if(rotate==0){
            return head;
        }
        ListNode firstNode=null;
        int count=sizeofList-rotate;
        while(temp.next!=null){
            if(count==1){
                ListNode Lastnode=temp;
               
                temp=temp.next;
                firstNode=temp;
                Lastnode.next=null;
            }
            else{
                temp=temp.next;
                
            }
            count--;


        }

        temp.next=head;
        head=firstNode;
        

        return head;
       
    }
}