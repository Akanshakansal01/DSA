package Tree;

public class Diameter_Of_Binary_Tree {
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
        public int diameterOfBinaryTree(TreeNode root) {
            if(root==null)
            {
                return 0;
            }
            int leftDiameter = diameterOfBinaryTree(root.left);
            int rightDiameter = diameterOfBinaryTree(root.right);
            int sumDiameter = height(root.left)+height(root.right)+2;
            return Math.max(leftDiameter,Math.max(rightDiameter,sumDiameter));  // maximum of these three diameter is the answer
        }
        public int height(TreeNode root)
        {
            if(root==null) {
                return -1;
            }
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
    }
}
