package Trie;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Different_Ways_to_Add_Parentheses_leetcode {
    public static void main(String[] args) {
        String s= "2*3-4*5";
        System.out.println(Different_Ways(s));
    }
    public static List<Integer> Different_Ways(String s){
        if(s.indexOf('+')==-1 && s.indexOf('-')==-1 && s.indexOf('*')==-1){
            List<Integer> ll = new ArrayList<>();
            ll.add(Integer.parseInt(s));
            return ll;
        }
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(isOperator(ch)){
                List<Integer> left = Different_Ways(s.substring(0,i));
                List<Integer> right = Different_Ways(s.substring(i+1));
                for(int a:left){
                    for(int b:right){
                        int val=Calculation(a,b,ch);
                        ans.add(val);
                    }
                }
            }
        }
        return ans;
    }
    public static boolean isOperator(char ch){
        if(ch=='+' || ch=='-' || ch=='*'){
            return true;
        }
        return false;
    }

    public static int Calculation(int a,int b,char ch){
        if(ch=='+'){
            return a+b;
        }
        else if(ch=='-'){
            return a-b;
        }
        else {
            return a * b;
        }
    }
}
