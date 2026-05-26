class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1. Create a dummy node to easily handle the head of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        // 2. Loop until one of the lists becomes null
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next; // Move list1 pointer forward
            } else {
                tail.next = list2;
                list2 = list2.next; // Move list2 pointer forward
            }
            tail = tail.next; // Move the tail pointer forward
        }

        // 3. Append the remaining nodes of whichever list is left
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        // 4. The actual merged list starts from dummy.next
        return dummy.next;
    }
}