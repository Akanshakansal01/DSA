package Leetcode;

import java.util.Scanner;
import java.util.Stack;

public class Valid_Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        System.out.println(valid_parenthesis(s));
    }
    public static boolean valid_parenthesis(String s){
        Stack<Character> st = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(')
                st.push(')');
            else if(c=='{')
                st.push('}');
            else if(c=='[')
                st.push(']');
            else if(st.isEmpty() || st.pop()!=c)
                return false;
        }
        return st.isEmpty();
    }
}
