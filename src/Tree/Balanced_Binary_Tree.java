package Tree;

public class Balanced_Binary_Tree {
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

    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true;
            }
            boolean left=isBalanced(root.left);
            boolean right= isBalanced(root.right);
            boolean isBal=Math.abs(height(root.left)-height(root.right))<=1;
            return left && right && isBal;
        }

        public int height(TreeNode root) {
            if (root == null) {
                return -1;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
