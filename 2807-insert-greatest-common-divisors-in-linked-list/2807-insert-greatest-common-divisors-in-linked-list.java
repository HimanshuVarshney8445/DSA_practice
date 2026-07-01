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
    public int gcd(int a,int b){
        while(b!=0){
            int temp = a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            int num = gcd(cur.val,cur.next.val);
            ListNode temp = new ListNode(num);
            ListNode nextNode = cur.next;
            cur.next=temp;
            temp.next=nextNode;
            cur=nextNode;
        }
        return head;
    }
}