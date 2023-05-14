package 左神算法啊;

import java.util.ArrayList;
import java.util.List;

//145. 二叉树的后序遍历
public class leetcode_145 {
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
        public List<Integer> postorderTraversal(TreeNode root) {
            ArrayList<Integer> list=new ArrayList<Integer>();
            postorder(root,list);
            return list;
        }

        public void postorder(TreeNode root,ArrayList<Integer> list){
            if(root==null){
                return;
            }
            postorder(root.left, list);
            postorder(root.right, list);
            list.add(root.val);
        }
    }
}
