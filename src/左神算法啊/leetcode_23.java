package 左神算法啊;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//23. 合并 K 个升序链表
public class leetcode_23 {
    public class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    class Solution {
        class Status implements Comparable<Status>{
            int val;
            ListNode ptr;

            public Status(int val, ListNode ptr) {
                this.val = val;
                this.ptr = ptr;
            }
            public int compareTo(Status status2){
                return this.val-status2.val;
            }
        }

        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Status> heap=new PriorityQueue<>();
            for(ListNode node:lists){
                if(node!=null){
                    heap.offer(new Status(node.val, node));
                }
            }
            ListNode head=new ListNode(0);
            ListNode tail=head;
            while(!heap.isEmpty()){
                Status f=heap.poll();
                tail.next=f.ptr;
                tail=tail.next;
                if(f.ptr.next!=null){
                    heap.offer(new Status(f.ptr.next.val,f.ptr.next));
                }
            }
            return head.next;
        }
    }

    class Solution2{
        public ListNode mergeKLists(ListNode[] lists) {
            List<Integer> list=new ArrayList<>();
            for(ListNode node:lists){
                list.add(node.val);
                node=node.next;
            }
            list.sort(Comparator.comparingInt(o->o));
            ListNode dump=new ListNode(),p=dump;
            for(Integer val:list){
                p.next=new ListNode(val);
                p=p.next;
            }
            return dump.next;
        }
    }
}
