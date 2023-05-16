package 左神算法;
/*
* 两个链表相加
* */
public class mianshi0205 {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int len1=listlength(l1);
            int len2=listlength(l2);
            ListNode l=len1>=len2?l1:l2;
            ListNode s=l==l1?l2:l1;
            ListNode curL=l;
            ListNode curS=s;
            ListNode lastcur=curL;
            int jinwei=0;
            int curnum=0;
            while(curS!=null){
                curnum=curL.val+curS.val+jinwei;
                curL.val=curnum%10;
                jinwei=curnum/10;
                lastcur=curL;
                curL=curL.next;
                curS=curS.next;
            }
            while(curL!=null){
                curnum=curL.val+jinwei;
                curL.val=curnum%10;
                jinwei=curnum/10;
                lastcur=curL;
                curL=curL.next;
            }
            if(jinwei!=0){
                lastcur.next=new ListNode(1);
            }
            return l;
        }

//       求链表长度
        public int listlength(ListNode head){
            int count=0;
            while(head!=null){
                count++;
                head=head.next;
            }
            return count;
        }
    }
}
