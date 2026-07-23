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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        ListNode current = head;

        // Push all values into the stack
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        // Compare while traversing again
        current = head;

        while (current != null) {
            if (current.val != stack.pop()) {
                return false;
            }
            current = current.next;
        }

        return true;
    }
}