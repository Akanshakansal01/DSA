/* A binary expression tree is a kind of binary tree used to represent arithmetic expressions. Each node of a binary expression tree
has either zero or two children. Leaf nodes (nodes with 0 children) correspond to operands (numbers), and internal nodes (nodes with 2 children)
correspond to the operators '+' (addition), '-' (subtraction), '*' (multiplication), and '/' (division).
--- For each internal node with operator o, the infix expression that it represents is (A o B), where A is the expression the left subtree
     represents and B is the expression the right subtree represents.
--- You are given a string s, an infix expression containing operands, the operators described above, and parentheses '(' and ')'.
--- Return the binary expression tree, which its in-order traversal reproduce s.
--- Please note that order of operations applies in s. That is, expressions in parentheses are evaluated first, and multiplication and division
    happen before addition and subtraction.
Input: s = "2-3/(5*2)+1"
Output: [+,-,1,2,/,null,null,null,null,3,*,null,null,5,2]
Question Link: https://leetcode.ca/all/1597.html
 */
package BinarySearchTree;

import java.util.Stack;

public class Build_Binary_Expression_Tree_Infix_Expression {
    public class Node{
        char val;
        Node left;
        Node right;
        Node() {
            this.val=' ';
        }
        Node(char val) {
            this.val = val;
        }
        Node(char val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public Node expTree(String s)
        {
            if(s.length()==0)
                return null;
            if(s.length()==1)
                return new Node(s.charAt(0));
            int p=-1;   // plus
            int m=-1;   //  multiplication
            int d=-1;    //  division
            int s1=-1;   // subtraction
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='+')
                {
                    p=i;
                }
                else if(s.charAt(i)=='-')
                {
                    s1=i;
                }
                if(s.charAt(i)=='*')
                {
                    m=i;
                }
                if(s.charAt(i)=='/')
                {
                    d=i;
                }
            }
            Node nn=new Node();
            if(d!=-1)
            {
                nn.val=s.charAt(d);
                nn.left=expTree(s.substring(0,d));
                nn.right=expTree(s.substring(d+1));
            }
            else if(p!=-1)
            {
                nn.val=s.charAt(p);
                nn.left=expTree(s.substring(0,p));
                nn.right=expTree(s.substring(p+1));
            }
            else if(s1!=-1)
            {
                nn.val=s.charAt(s1);
                nn.left=expTree(s.substring(0,s1));
                nn.right=expTree(s.substring(s1+1));
            }
            else if(m!=-1)
            {
                nn.val=s.charAt(m);
                nn.left=expTree(s.substring(0,m));
                nn.right=expTree(s.substring(m+1));
            }
            return nn;
        }
    }
    public String GetPotfix(String s)
    {
        StringBuilder sb= new StringBuilder();
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>=0 && ch<=9)
            {
                sb.append(ch);
            }
            else if(ch=='(')
            {
                st.push(ch);
            }
            else if(ch==')')
            {
                while(st.peek()!='(')
                {
                    sb.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && GetValue(st.peek()) >= GetValue(ch))
                {
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.toString();
    }
    public  int GetValue(char ch)
    {
        if(ch=='+' || ch=='-')
        {
            return 1;
        }
        else if(ch=='*' || ch=='/')
        {
            return 2;
        }
        return -1;
    }
}
