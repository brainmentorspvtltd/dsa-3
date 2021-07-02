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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        
        ListNode oddEnd=head,evenEnd=head.next,oddHead=head,evenHead=head.next;
        
        while(evenEnd!=null && evenEnd.next!=null && oddEnd!=null && oddEnd.next!=null){
            
            oddEnd.next=evenEnd.next;
            oddEnd=oddEnd.next;
            
            evenEnd.next=oddEnd.next;
            evenEnd=evenEnd.next;
            
        }
        
        oddEnd.next=evenHead;
        
        return oddHead;
    }
}