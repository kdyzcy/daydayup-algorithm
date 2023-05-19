package leetcode;

public class leetcode_2 {
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

        public ListNode() {
        }
    }


    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int sum=0,sum1=0,sum2=0,p=1;
            while (l1!=null){
                sum1+=l1.val+p;
                p*=10;
                l1=l1.next;
            }
            p=1;
            while (l2!=null){
                sum2+=l2.val+p;
                p*=10;
                l2=l2.next;
            }
            sum=sum1+sum2;
            String str=sum+"";
            char[] ch= str.toCharArray();
            ListNode head=new ListNode();
            for (int i = ch.length-1; i >=0; i--) {
                ListNode l=new ListNode(i);
                l.val=(int)str.charAt(i);
                l=l.next;
            }
            return head;
        }
    }







    class Solution1 {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int len1=0,len2=0,sum1=0,sum2=0;
            while (l1!=null){
                len1++;
            }
            while (l2!=null){
                len2++;
            }
            int[] arr1=new int[len1];
            int[] arr2=new int[len2];
            int p=1;
            for (int i = len1-1; i >=0; i--) {
                arr1[i]=l1.val;
                sum1+=arr1[i]*p;
                p*=10;
                l1=l1.next;
            }
            p=1;
            for (int i = len2-1; i >=0; i--) {
                arr2[i]=l2.val;
                sum2+=arr2[i]*p;
                p*=10;
                l2=l2.next;
            }
            int sum=sum1+sum2;
            String str=sum+"";
            char[] ch= str.toCharArray();
            ListNode l=null;
            for (int i = ch.length-1; i >=0; i--) {
                l.val=(int)str.charAt(i);
                l=l.next;
            }
            return l;
        }
    }
}
