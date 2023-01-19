package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Level_Order {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc= new Scanner(System.in);

    public Create_Level_Order()
    {
        this.root=CreateTree();
    }

    private Node CreateTree(){
        Queue<Node> q= new LinkedList<>();
        Node nn= new Node();
        int val= sc.nextInt();  // 10
        nn.val=val;
        root=nn;
        q.add(nn);
        while(!q.isEmpty())
        {
            Node rv= q.remove();  // remove first element
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if(c1!=-1)
            {
                Node node= new Node();
                node.val=c1;
                rv.left=node;
                q.add(node);
            }
            if(c2!=-1)
            {
                Node node= new Node();
                node.val=c2;
                rv.right=node;
                q.add(node);
            }
        }
        return root;
    }
    public void PreOrder() {
        PreOrder(root);
        System.out.println();
    }

    private void PreOrder(Node node) {
        // TODO Auto-generated method stub
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        PreOrder(node.left);
        PreOrder(node.right);

    }

    public static void main(String[] args) {
        Create_Level_Order cl=new Create_Level_Order();
        cl.PreOrder();
//        10 20 30 -1 6 -1 9 7 8 -1 -1 -1 -1 -1 -1
//        10 20 6 7 8 30 9
    }
}
