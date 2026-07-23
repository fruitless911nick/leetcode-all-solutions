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
    public ListNode removeNodes(ListNode head) {
        if(head==null){
            return null;
        }
         head= reverseLinkedList(head);
            ListNode temp=head;
            int max=temp.val;
            while(temp!=null && temp.next!=null){
                if(temp.next.val<max){
                    temp.next=temp.next.next;
                }
                else{
                    temp=temp.next;
                    max=temp.val;
                }
            }
           head=reverseLinkedList(head);
            return head;
    }
    public ListNode reverseLinkedList(ListNode head){
            ListNode curr=head;
            ListNode prev=null;
            while(curr!=null){
                ListNode nextNode=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextNode;
            }
            head=prev;
            return head;
        }
}