class Solution {

    public Node flatten(Node head) {

        if (head == null) {
            return null;
        }

        flattenHelper(head);

        return head;
    }

    public Node flattenHelper(Node head) {

        Node curr = head;
        Node last = head;

        while (curr != null) {

            if (curr.child != null) {

                Node forward = curr.next;
                Node childNode = curr.child;

                curr.next = childNode;
                childNode.prev = curr;
                curr.child = null;

                Node tail = flattenHelper(childNode);

                if (forward != null) {
                    tail.next = forward;
                    forward.prev = tail;
                }

                curr = tail;
            }

            last = curr;
            curr = curr.next;
        }

        return last;
    }
}