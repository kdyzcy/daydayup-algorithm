package 代码随想录.链表;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/*
 * 移除链表元素
 * */
public class leetcode_203 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    /*
    * 没有使用虚拟头结点
    * */
    class Solution1 {
        public ListNode removeElements(ListNode head, int val) {
            while(head!=null && head.val==val){
                head = head.next;
            }
            ListNode curr = head;
            while(curr!=null){
                while(curr.next!=null && curr.next.val == val){
                    curr.next = curr.next.next;
                }
                curr = curr.next;
            }
            return head;
        }
    }
    /*
    * 使用虚拟头结点
    * */
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if(head==null){
                return head;
            }
            ListNode dummy=new ListNode(-1,head);
            dummy.next=head;
            ListNode cur=dummy;
            while(cur.next!=null){
                if(cur.next.val==val){
                    cur.next=cur.next.next;
                }else{
                    cur=cur.next;
                }
            }
            return dummy.next;
        }
    }
}
