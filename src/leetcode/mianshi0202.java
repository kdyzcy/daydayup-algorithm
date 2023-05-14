package leetcode;

/*
* 面试题 02.02. 返回倒数第 k 个节点
* */
public class mianshi0202 {
    public class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    class Solution {
        public int kthToLast(ListNode head, int k) {
            ListNode pre=null;
            ListNode next=null;
            int ans=0;
            while (head!=null){
                next=head.next;
                head.next=pre;
                pre=head;
                head=next;
            }
            for (int i = 1; i < k; i++) {
                pre=pre.next;
            }
            return pre.val;
        }
    }
}
