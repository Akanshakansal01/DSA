package BinarySearchTree;

//public class Largest_BST_Subtree {
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode() {}
//        TreeNode(int val)
//        {
//            this.val = val;
//        }
//        TreeNode(int val, TreeNode left, TreeNode right)
//        {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//    class BstPair{
//        boolean isbst=true;
//        long min=Long.MAX_VALUE;
//        long max=Long.MIN_VALUE;
//        int size=0;
//    }
//    class Solution{
//        public int largestBSTSubtree(TreeNode root)
//        {
//            return ValidBst(root).size;
//        }
//        public BstPair ValidBst(TreeNode root)
//        {
//            if(root==null)
//                return new BstPair();
//            BstPair lbp= ValidBst(root.left);
//            BstPair rbp= ValidBst(root.right);
//            BstPair sbp=new BstPair();
//            sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
//            sbp.min=Math.max(lbp.min,Math.max(rbp.min,root.val));
//            if(lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min> root.val)
//            {
//                sbp.isbst=true;
//                sbp.size=lbp.size+rbp.size+1;
//            }
//            else{
//                sbp.isbst=false;
//                sbp.size=Math.max(lbp.size,rbp.size+);
//            }
//            return sbp;
//        }
//    }
//
//}
