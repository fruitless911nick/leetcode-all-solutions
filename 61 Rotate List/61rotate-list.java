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
        if(head==null){
            return null;
        }
        ListNode t=head;
        int len=0;
    while (t!=null){
        len++;
        t=t.next;
    }
        k=k%len;
        if(k==0){
            return head;
        }
         
       
        for(int i=1;i<=k;i++){
             ListNode current=head;
             ListNode previous=null;
            while(current.next!=null){
                previous=current;
                current=current.next;
            }
            previous.next=null;
            current.next=head;
            head=current;
        }
        return head;
    }
}