package Leetcode;

public class Recovery_Binary_Search_Tree_Space_Optimize {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution{
        TreeNode prev;
        TreeNode first;
        TreeNode second;

        public void recoveryTree(TreeNode root){
            Inorder(root);
            int temp=first.val;
            first.val= second.val;
            second.val= temp;
        }

        public void Inorder(TreeNode root){
            if(root==null){
                return;
            }
            Inorder(root.left);
            if(prev!=null && prev.val>root.val){
                if(first== null){
                    first=prev;
                }
                    second=root;
            }
            prev=root;
            Inorder(root.right);
        }
    }
}
