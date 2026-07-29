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
    public ListNode doubleIt(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        int carry=0;
        ListNode start = prev;
        ListNode end = null;
        while(start!=null){
            int temp = start.val*2 + carry;
            start.val=temp%10;
            carry=temp/10;
            end=start;
            start=start.next;
        }
        if(carry!=0){
            end.next = new ListNode(carry);
        }
        ListNode curr2 = prev;
        ListNode prev2 = null;
        while(curr2!=null){
            ListNode temp = curr2.next;
            curr2.next=prev2;
            prev2=curr2;
            curr2=temp;
        }
        return prev2;
    }
}