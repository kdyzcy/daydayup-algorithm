package 代码随想录.链表;

import leetcode.jinazhi06;
import org.junit.jupiter.api.Test;

import java.util.Stack;

/*
* 回文链表
* */
public class leetcode_234 {
    public class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }
    }
    class Solution {
        public boolean isPalindrome(ListNode head) {
            Stack<Integer> stack=new Stack<Integer>();
            ListNode cur=head;
            while(cur!=null){
                stack.push(cur.val);
                cur=cur.next;
            }
            while(head!=null){
                if(stack.pop()!=head.val) {
                    return false;
                }
                head=head.next;
            }
            return true;
        }
    }
}
