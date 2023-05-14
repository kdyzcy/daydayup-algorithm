package leetcode;
/*
* 反转链表
* */
public class leetcode_206 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            if(head==null){
                return head;
            }
            ListNode pre=null;
            ListNode next=null;
            while(head!=null){
                next=head.next;
                head.next=pre;
                pre=head;
                head=next;
            }
            return pre;
        }
    }
}
