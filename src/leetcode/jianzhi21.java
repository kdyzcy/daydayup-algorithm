package leetcode;
/*
* 剑指 Offer II 021. 删除链表的倒数第 n 个结点
* */
public class jianzhi21 {
    public class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }
    }
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int len=getlen(head);
            if(len==1){
                return null;
            }
            int k=len-n;
            ListNode cur=head;
            if(k==0){
                head= head.next;
                return head;
            }
            for (int i = 1; i < k; i++) {
                cur=cur.next;
            }
            cur.next=cur.next.next;
            return head;
        }

        public int getlen(ListNode head){
            int cou=0;
            while(head!=null){
                cou++;
                head=head.next;
            }
            return cou;
        }
    }
}
