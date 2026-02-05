class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);   // fixed
        ListNode temp = result;

        int remainder = 0;

        while (l1 != null || l2 != null || remainder != 0) {   // fixed loop

            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int add = x + y + remainder;

            remainder = add / 10;   // fixed carry
            add = add % 10;         // digit to store

            temp.next = new ListNode(add);   // add to result list
            temp = temp.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return result.next;   // skip dummy node
    }
}

// Example 1;
// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.
// Example 2:

// Input: l1 = [0], l2 = [0]
// Output: [0]
// Example 3:

// Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1]