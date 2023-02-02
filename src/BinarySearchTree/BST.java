package BinarySearchTree;

import Tree.Binary_Tree;

public class BST {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public BST(int[] inorder)
    {
        this.root=CreateTree(inorder,0,inorder.length-1);
    }
    public Node CreateTree(int[] inorder,int si,int ei)
    {
        if(si>ei)
        {
            return null;
        }
        int mid=(si+ei)/2;
        Node nn=new Node();
        nn.val=inorder[mid];
        nn.left=CreateTree(inorder,si,mid-1);
        nn.right=CreateTree(inorder,mid+1,ei);
        return nn;
    }
    public void PreOrder()
    {
        PreOrder(root);
        System.out.println();
    }
    private void PreOrder(Node nn)
    {
        if (nn == null) {
            return;
        }
        System.out.print(nn.val + " ");
        PreOrder(nn.left);
        PreOrder(nn.right);
    }
    public static void main(String[] args) {
        int[] in = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        BST bst = new BST(in);
        bst.PreOrder();

    }
}
