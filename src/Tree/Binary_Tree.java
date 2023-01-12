package Tree;

import java.util.Scanner;

public class Binary_Tree {
    private class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc= new Scanner(System.in);

    public Binary_Tree()
    {
        root=CreateTree();
    }

    private Node CreateTree()
    {
        int item = sc.nextInt();           // 10(root)
        Node nn=new Node();
        nn.val=item;
        boolean hlc= sc.nextBoolean();       // hlc= has left child
        if(hlc)
        {
            nn.left=CreateTree();
        }
        boolean hrc= sc.nextBoolean();       // hrc= has right child
        if(hrc)
        {
            nn.right=CreateTree();
        }
        return  nn;
    }

    public void Display()
    {
        Display(root);
    }

    private void Display(Node node)
    {
        if(node==null)
        {
            return;
        }
        String s = "";
        s = "<--" +s+ node.val + "-->";
        if(node.left !=null)
        {
            s=node.left.val +s;
        }
        else
        {
            s= "."+s;
        }
        if(node.right !=null)
        {
            s= s + node.right.val;
        }
        else
        {
            s= s + ".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);
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

    public void PostOrder()
    {
        PostOrder(root);
        System.out.println();
    }
    private void PostOrder(Node nn)
    {
        if (nn == null) {
            return;
        }
        PostOrder(nn.left);
        PostOrder(nn.right);
        System.out.print(nn.val + " ");
    }

    public void InOrder()
    {
        InOrder(root);
        System.out.println();
    }
    private void InOrder(Node nn)
    {
        if (nn == null) {
            return;
        }
        InOrder(nn.left);
        System.out.print(nn.val + " ");
        InOrder(nn.right);
    }

    public boolean Search(int item)
    {
        return Search(root, item);
    }
    private boolean Search(Node nn, int item)
    {
        if (nn == null) {
            return false;
        }
        if (nn.val == item) {
            return true;
        }
        boolean left = Search(nn.left, item);
        boolean right = Search(nn.right, item);
        return left || right;
    }

    public int Max()
    {
        return Max(root);
    }
    private int Max(Node node)
    {
        if(node ==null)
        {
            return Integer.MIN_VALUE;
        }
        int left=Max(node.left);
        int right= Max(node.right);
        return Math.max(left,Math.max(right,node.val));
    }



}
