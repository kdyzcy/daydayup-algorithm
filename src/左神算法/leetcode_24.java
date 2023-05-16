package 左神算法;
/*
* 反转链表
* */
public class leetcode_24 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
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
