package BinarySearchTree;

public class Validate_BST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val)
        {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right)
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class BstPair{
        boolean isbst=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
    }
    class Solution {
        public boolean isValidBST(TreeNode root) {
            return ValidBst(root).isbst;
        }
        public BstPair ValidBst(TreeNode root)
        {
            if(root==null)
                return new BstPair();
            BstPair lbp= ValidBst(root.left);
            BstPair rbp= ValidBst(root.right);
            BstPair sbp=new BstPair();
            sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
            sbp.min=Math.max(lbp.min,Math.max(rbp.min,root.val));
            if(lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min> root.val)
            {
                sbp.isbst=true;
            }
            else
                sbp.isbst=false;
            return sbp;
        }
    }
}
