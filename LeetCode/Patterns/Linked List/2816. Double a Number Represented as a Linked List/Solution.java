class Solution {

    ListNode reverse(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public ListNode doubleIt(ListNode head) {

        // 1. Reverse the linked list
        ListNode reverseList = reverse(head);

        // 2. Double each digit
        ListNode temp = reverseList;
        int carry = 0;

        while (temp != null) {

            int value = temp.val * 2 + carry;

            temp.val = value % 10;
            carry = value / 10;

            temp = temp.next;
        }

        // 3. If carry is remaining, add new node
        if (carry != 0) {
            ListNode newNode = new ListNode(carry);
            temp = reverseList;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        // 4. Reverse again
        return reverse(reverseList);
    }
}