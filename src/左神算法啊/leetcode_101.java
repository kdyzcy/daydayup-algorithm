package 左神算法啊;
//101. 对称二叉树
public class leetcode_101 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode() {
        }
    }

    class Solution{
        public boolean isSymmetric(TreeNode root) {
            return isMirror(root,root);
        }

        public  boolean isMirror(TreeNode h1,TreeNode h2){
            if(h1==null^h2==null){
                return false;
            }
            if(h1==null&&h2==null){
                return true;
            }
            return (h1.val==h2.val)&&isMirror(h1.left,h2.right)&&isMirror(h1.right,h2.left);
        }
    }

}
