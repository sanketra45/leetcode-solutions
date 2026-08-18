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
    public ListNode rotateRight(ListNode head, int k) {

        // FIRST WE CHECK THE BASE CASE
        if(head == null || head.next == null || k == 0) return head;

        // FIND THE LENGTH OF THE LIST
        int length = 0;
        ListNode temp = head;
        while(temp != null)
        {
            length++;
            temp = temp.next;
        }

        temp = head;
        k = k % length;

        if(k == 0) return head;

        // MOVE TEMP TILL THE K - 1 TH NODE FROM THE END
        for(int i = 0; i < length - k - 1; i++)
        {
            temp = temp.next;
        }

        // BREAK THE LIST INTO TWO PARTS 
        ListNode newHead = temp.next;
        temp.next = null;

        temp = newHead;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        // JOIN THEM
        temp.next = head;

        return newHead;
    }
}