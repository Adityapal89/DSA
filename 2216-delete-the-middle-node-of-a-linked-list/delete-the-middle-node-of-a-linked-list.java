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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        int len = size(head);
        ListNode temp = head;

        for (int i = 0; i < (len/2)-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public static int size(ListNode head){
        int count = 0;
        ListNode temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}