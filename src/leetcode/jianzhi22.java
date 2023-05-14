package leetcode;
/*
* 剑指 Offer 22. 链表中倒数第k个节点
* */
public class jianzhi22 {
    public class ListNode{
        int val;
        ListNode next;

        public ListNode(int x) {
            this.val = x;
        }
    }
    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            int len=getlen(head);
            for (int i = 1; i <=len-k ; i++) {
                head=head.next;
            }
            return head;
        }

        public int getlen(ListNode head){
            int cou=0;
            while (head!=null){
                cou++;
                head=head.next;
            }
            return cou;
        }
    }
}
