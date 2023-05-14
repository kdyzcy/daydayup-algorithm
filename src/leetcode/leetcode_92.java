package leetcode;
/*
* 反转链表||
* */
public class leetcode_92 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) { this.val = val; }
        ListNode(int val, leetcode_92.ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            if(left==right){
                return head;
            }
            ListNode p=head;
            ListNode next=null;
            ListNode pre=null;
            for(int i=1;i<=left;i++){
                p=p.next;
            }
            pre=p;
            p=p.next;
            int count=left;
            while (count<=right){
                next=p.next;
                p.next=pre;
                pre=p;
            }
            return head;
        }
    }
}
