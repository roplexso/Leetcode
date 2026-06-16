/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to easily handle the head of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        // Loop while both lists have elements remaining
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;  // Link the smaller node
                list1 = list1.next;    // Move list1 pointer forward
            } else {
                current.next = list2;  // Link the smaller node
                list2 = list2.next;    // Move list2 pointer forward
            }
            current = current.next;    // Move the merged list pointer forward
        }
        
        // If one list runs out of elements, append the remainder of the other list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        
        // The actual merged list starts after the dummy node
        return dummy.next;
    }
}