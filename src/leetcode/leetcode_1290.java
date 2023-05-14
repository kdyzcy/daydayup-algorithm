package leetcode;

import 程序员面试指南.链表问题.合并两个有序的单链表;

/*
* 1290. 二进制链表转整数
* */
public class leetcode_1290 {
    public class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }
    }
    class Solution {
        public int getDecimalValue(ListNode head) {
            ListNode pre=null;
            ListNode next=null;
            while (head!=null){
                next=head.next;
                head.next=pre;
                pre=head;
                head=next;
            }
            int d=1,ans=0;
            while (pre!=null){
                if(pre.val==1){
                    ans+=pre.val*d;
                }
                d*=2;
            }
            return ans;
        }
    }
}
