package leetcode;

import sun.reflect.generics.tree.Tree;

//100. 相同的树
public class leetcode_100 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
        }
    }

    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
           return SameTree(p,q);
        }

        public boolean SameTree(TreeNode p,TreeNode q){
            if(p==null&&q==null){
                return true;
            }
            if(p==null||q==null){
                return false;
            }
            return (q.val==p.val)&&(SameTree(q.left,p.left))&&(SameTree(q.right,p.right));
        }
    }
}
