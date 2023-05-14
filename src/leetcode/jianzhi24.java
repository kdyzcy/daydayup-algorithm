package leetcode;
/*
* 反转链表
* */
public class jianzhi24 {
    public class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode() {
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            if(head==null){
                return head;
            }
            ListNode pre=null;
            ListNode next=null;
            while (head!=null){
                next=head.next;
                head.next=pre;
                pre=head;
                head=next;
            }
            return pre;
        }
    }
}
