package leetcode;
/*
* 剑指 Offer 06. 从尾到头打印链表
* */
public class jinazhi06 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }

    class Solution {
        public int[] reversePrint(ListNode head) {
            int len=getlen(head);
            int[] arr=new int[len];
            for (int i = len-1; i >=0 ; i--) {
                arr[i]= head.val;
                head=head.next;
            }
            return arr;
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
