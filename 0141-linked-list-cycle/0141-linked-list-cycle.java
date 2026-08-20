/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

       ListNode slow = head;
        ListNode fast = head;

        // Continue while fast can move two steps
        while (fast != null && fast.next != null) {

            // Move slow by one node
            slow = slow.next;

            // Move fast by two nodes
            fast = fast.next.next;

            // If they meet, a cycle exists
            if (slow == fast) {
                return true;
            }
        }

        // Fast reached the end, so there is no cycle
        return false;

       
        
    }
}