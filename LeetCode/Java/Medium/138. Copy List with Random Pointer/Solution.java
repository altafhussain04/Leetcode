/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head==null){
            return head;
        }

        Node temp=head;

        while(temp!=null){

            Node CopyNode=new Node(temp.val);
            CopyNode.next=temp.next;
            temp.next=CopyNode;
            temp=CopyNode.next;

        }

        temp=head;

        while(temp!=null){

            Node Original=temp;
            Node Copy=temp.next;

            if(Original.random!=null){
                Copy.random=Original.random.next;

               
            } 
            temp=temp.next.next;

           
        }

        temp=head;
        Node AnsList=head.next;

        while(temp!=null){

            Node Original=temp;
            Node Copy=temp.next;

            Original.next=Copy.next;
            if(Copy.next!=null){
                 Copy.next=Copy.next.next;
            }
           

            temp=temp.next;
        }

        return AnsList;


       

         

           

           
        
        
    }
}