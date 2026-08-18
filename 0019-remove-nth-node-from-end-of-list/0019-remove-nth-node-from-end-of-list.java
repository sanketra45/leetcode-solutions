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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // IN THIS PROBLEM WE USE TWO POINTERS APPROACH
        ListNode slow = head;
        ListNode fast = head;

        // FIRST WE REACH TILL THE PREVIOUS NODE OF THE REQ NODE
        for(int i = 0; i < n; i++)
        {
            fast = fast.next;
        }
        
        if(fast == null) return head.next;

        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        // SKIP THE REQ NODE FORM THE LIST
        slow.next = slow.next.next;

        return head;
    }
}