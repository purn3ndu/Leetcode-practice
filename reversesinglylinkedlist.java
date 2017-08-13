/*
206. Reverse Linked List

Reverse a singly linked list.
*/



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode a = null;
        ListNode b = head;
        while(b!=null){
            ListNode c = b.next;
            b.next = a;
            a = b;
            b = c;
            
        }
        return a;
    }
}