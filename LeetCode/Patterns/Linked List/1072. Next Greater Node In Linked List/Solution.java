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
    public int[] nextLargerNodes(ListNode head) {

        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }

        Stack<int[]> st=new Stack<>();
         temp=head;
        int[] arr=new int[n];

       
        int index=0;

        while(temp!=null){
            if(!st.isEmpty() && temp.val>st.peek()[1]){
                arr[st.peek()[0]]=temp.val;
                st.pop();

            }
            else{
                st.push(new int[]{index,temp.val});
                temp=temp.next;
                index++;
            }
        }
        return arr;
        
         

        
        
    }
}