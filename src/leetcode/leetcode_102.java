package leetcode;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class leetcode_102 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }
    class Solution {
        public List<List<Integer>> reslist=new ArrayList<List<Integer>>();
        public List<List<Integer>> levelOrder(TreeNode root) {
            BFSTree(root);
            return  reslist;
        }

        public void BFSTree(TreeNode node){
            if(node==null){
                return;
            }
            Queue<TreeNode> que=new LinkedList<>();
            que.offer(node);
            while (!que.isEmpty()){
                List<Integer> list=new ArrayList<Integer>();
                int size=que.size();
                while (size>0){
                    TreeNode temp=que.poll();
                    list.add(temp.val);
                    if(temp.left!=null){
                        que.offer(temp.left);
                    }
                    if(temp.right!=null){
                        que.offer(temp.right);
                    }
                    size--;
                }
                reslist.add(list);
            }
        }
    }
}
