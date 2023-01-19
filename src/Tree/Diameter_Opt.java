package Tree;

public class Diameter_Opt {
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

    public class DiaPair{
        int height= -1;
        int diameter=0;
    }

    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            return diameter(root).diameter;
        }

        public DiaPair diameter(TreeNode root)
        {
            if(root==null)
                return new DiaPair();
            DiaPair ldp=diameter(root.left); // ldp= left DiaPair
            DiaPair rdp= diameter(root.right);

            DiaPair sdp=new DiaPair();
            int sd=ldp.height+ rdp.height+2;
            sdp.diameter=Math.max(ldp.diameter,Math.max(rdp.diameter, sd));
            sdp.height= Math.max(ldp.height,rdp.height)+1;
            return sdp;
        }
    }
}
