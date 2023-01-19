package Tree;

public class Lowest_Common_Ancestor_of_Binary_Tree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x)
      { val = x; }
  }
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root==null)
            {
                return root;
            }
            if(root==p || root==q)
            {
                return root;
            }
            TreeNode left= lowestCommonAncestor(root.left,p,q);
            TreeNode right= lowestCommonAncestor(root.right,p,q);
            if(left!=null && right!=null)
            {
                return root;
            }
            else if(left!=null)
            {
                return left;
            }
            else
            {
                return right;
            }
        }
    }
}
