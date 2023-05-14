package Acwing;

public class Acwing_35 {
    public static class ListNode{
        ListNode next;
        int val;

        public ListNode(ListNode next, int val) {
            this.next = next;
            this.val = val;
        }

        public ListNode() {
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
