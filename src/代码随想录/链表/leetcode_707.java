package 代码随想录.链表;

/*
* 707. 设计链表
* */
public class leetcode_707 {
    class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }
    }
    class MyLinkedList {
        int size;
        ListNode head;
        public MyLinkedList() {
            size=0;
            head=new ListNode(0);
        }

        public int get(int index) {
            if(index<0||index>=size){
                return -1;
            }
            ListNode currentNode=head;
            for (int i = 0; i <=index; i++) {
                currentNode=currentNode.next;
            }
            return currentNode.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0,val);
        }

        public void addAtTail(int val) {
            addAtIndex(size,val);
        }

        public void addAtIndex(int index, int val) {
            if(index>size){
                return;
            }
            if(index<0){
                index=0;
            }
            ListNode pre=head;
            for (int i = 0; i < index; i++) {
                pre=pre.next;
            }
            ListNode s=new ListNode(val);
            s.next=pre.next;
            pre.next=s;
            size++;
        }

        public void deleteAtIndex(int index) {
            if(index<0||index>=size){
                return;
            }
            if(index==0){
                head=head.next;
                return;
            }
            ListNode pre=head;
            for (int i = 0; i < index; i++) {
                pre=pre.next;
            }
            pre.next=pre.next.next;
            size--;
        }
    }
}
