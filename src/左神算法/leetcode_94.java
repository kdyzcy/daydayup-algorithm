package 左神算法;

import java.util.ArrayList;
import java.util.List;

public class leetcode_94 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }

    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            ArrayList<Integer> list=new ArrayList<Integer>();
            inorder(root,list);
            return list;
        }

        public void inorder(TreeNode root,ArrayList<Integer> list){
            if(root==null){
                return;
            }
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
        }
    }
}
