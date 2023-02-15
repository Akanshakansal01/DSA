package BinarySearchTree;

public class Binary_Tree_Cameras {
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
    class Solution {
        int camera=0;
        public int minCameraCover(TreeNode root) {
            int c=CountCamera(root);

            if(c == -1)
            {
                camera++;
            }
            return camera;
        }
        public int CountCamera(TreeNode root)
        {
            if(root==null)
                return 1;
            int left=CountCamera(root.left);
            int right=CountCamera(root.right);
            if(left==-1 || right==-1)
            {
                camera++;
                return 2;
            }
            if(left==-1 && right==-1)
            {
                camera++;
                return 2;
            }
            if(left==-1 && right==-1)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
    }
}
