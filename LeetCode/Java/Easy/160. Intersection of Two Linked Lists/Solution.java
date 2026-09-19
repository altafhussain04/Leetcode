/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA=headA;
        ListNode tempB=headB;

        while(tempA!=null && tempB!=null){
            tempA=tempA.next;
            tempB=tempB.next;

        }

        if(tempA!=null){

          int remainstep=0;

          while(tempA!=null){
            remainstep++;
            tempA=tempA.next;
          }

          while(remainstep!=0){
            headA=headA.next;
            remainstep--;
          }


    
        }
       else{

          int remainstep=0;

          while(tempB!=null){
            remainstep++;
            tempB=tempB.next;
          }

          while(remainstep!=0){
            headB=headB.next;
            remainstep--;
          }


    
        }

        ListNode A=headA;
        ListNode B=headB;

        while(A!=null && B!=null){
            if(A==B){
                return A;
            }
            else{
                A=A.next;
                B=B.next;
            }
        }

        return A;

        
        
    }
}