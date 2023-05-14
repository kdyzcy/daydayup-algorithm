package 左神算法啊;
/*
* k个一组翻转链表
* */
public class leetcode_25 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode (int val){
            this.val=val;
        }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode start=head;
            ListNode end=getgroupend(start,k);
            if(end==null){
                return head;
            }
            head=end;
            reverse(start,end);
            ListNode lastEnd = start;
            while (lastEnd.next != null) {
                start = lastEnd.next;
                end = getgroupend(start, k);
                if (end == null) {
                    return head;
                }
                reverse(start, end);
                lastEnd.next = end;
                lastEnd = start;
            }
            return head;
        }

        public ListNode getgroupend(ListNode start,int k){
           while (--k!=0&&start!=null){
               start=start.next;
           }
           return start;
        }

        public void reverse(ListNode start,ListNode end){
            end=end.next;
            ListNode pre=null;
            ListNode next=null;
            ListNode cur=start;
            while(cur!=null){
                next=cur.next;
                cur.next=pre;
                pre=cur;
                cur=next;
            }
            start.next=end;
        }
    }
}
