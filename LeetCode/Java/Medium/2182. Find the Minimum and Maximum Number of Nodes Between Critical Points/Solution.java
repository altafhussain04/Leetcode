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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        if(head==null){
            return new int[]{-1,-1};
        }

        ListNode prev=head;
        ListNode curr=head.next;
        ArrayList<Integer> arr=new ArrayList<>();
        int index=1;


        while(curr.next!=null){

            if(prev.val<curr.val && curr.next.val<curr.val){
                arr.add(index);

            }
            if(prev.val>curr.val && curr.next.val>curr.val){
                arr.add(index);
            }
            curr=curr.next;
            prev=prev.next;
            index++;
        }

        if(arr.size()<2){
            return new int[]{-1,-1};
        }

        int min=Integer.MAX_VALUE;
        for(int i=1; i<arr.size(); i++){
            min=Math.min(min,(arr.get(i)-arr.get(i-1)));


        }

        int max=arr.get(arr.size()-1)-arr.get(0);

        return new int[]{min, max};


        
    }
}