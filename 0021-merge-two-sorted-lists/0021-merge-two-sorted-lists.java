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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

     ListNode sort=new ListNode(0);
     ListNode temp=sort;
     ListNode head,t1,t2;
    int d=0;
    while(list1!=null)
    {
        int data=list1.val;
        sort.next=new ListNode(data);
        sort=sort.next;
        list1=list1.next;
    }
    while(list2!=null)
    {
        int data=list2.val;
        sort.next=new ListNode(data);
        sort=sort.next;
        list2=list2.next;  
    }
    head=temp.next;
    for(t1=head;t1!=null;t1=t1.next)
    {
        for(t2=t1.next;t2!=null;t2=t2.next)
        {
            
            if(t1.val>t2.val)
            {
                d=t1.val;
                t1.val=t2.val;
                 t2.val=d;
            }
        }
       
    }
    
    
    return head;
}


}