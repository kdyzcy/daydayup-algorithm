package 左神算法;

import java.util.ArrayList;
import java.util.List;

//144. 二叉树的前序遍历
public class leetcode_144 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            ArrayList<Integer> list=new ArrayList<Integer>();
           preorder(root,list);
            return list;
        }

        public void preorder(TreeNode root,List<Integer> list){
            if(root==null){
                return;
            }
            list.add(root.val);
            preorder(root.left,list);
            preorder(root.right,list);
        }
    }
}
