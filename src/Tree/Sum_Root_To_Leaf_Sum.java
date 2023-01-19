package Tree;

public class Sum_Root_To_Leaf_Sum {
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
        public int sumNumbers(TreeNode root)
        {
            return sum(root, 0);
        }
        public int sum(TreeNode node, int sum)
        {
            if (node == null)
            {
                return 0;
            }
            if (node.left == null && node.right == null)
            {
                return sum * 10 + node.val;
            }
            int left = sum(node.left, sum * 10 + node.val);
            int right = sum(node.right, sum * 10 + node.val);
            return left + right;
        }
    }
}
