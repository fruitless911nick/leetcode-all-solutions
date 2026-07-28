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
        if(head==null){
            return null;
        }
        ListNode head1=reverse(head);
        ListNode temp=head1;
        ListNode prev=null;
        int count=1;
        while(count!=n){
            prev=temp;
            temp=temp.next;
       count++;
        }
        if(prev==null){
            head1=temp.next; 
        }
        else{
            prev.next=temp.next;
            }
        
       return reverse(head1);
    }
    public ListNode reverse(ListNode head){
        if(head==null){
            return null;
        }
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
        ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}