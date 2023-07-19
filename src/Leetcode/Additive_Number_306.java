package Leetcode;

import Dynamic_Programming.Lis;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Additive_Number_306 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next(); // 112358
        List<BigInteger> ll= new LinkedList<>();
//        is_Additive(str,"");
        System.out.println(is_Additive(str,ll));

    }

//    for partitioning code
//    public static boolean is_Additive(String ques,String ans){
//        if(ques.length()==1){
//            System.out.println(ans);
//            return;
//        }
//        for (int i=1;i<=ques.length();i++){
//            String s1= ques.substring(0,i);
//            is_Additive(ques.substring(i),ans+s1+"|");
//        }
//    }

    public static boolean is_Additive(String ques,List<BigInteger> ll){
        if(ques.length()==0){
            if(ll.size()>=3) {
                return true;
            }
            return false;
        }
        for (int i=1;i<=ques.length();i++){
            String s1= ques.substring(0,i);
            if(nonleading(s1) && validAdditive(ll,s1)){
                ll.add(new BigInteger(s1));
                boolean ans= is_Additive(ques.substring(i),ll);
                if(ans){
                    return ans;
                }
                ll.remove(ll.size()-1);
            }
        }
        return false;
    }

    public static boolean validAdditive(List<BigInteger> ll,String s1){
        if(ll.size()<=1){
            return true;
        }
        BigInteger f= ll.get(ll.size()-1);
        BigInteger s= ll.get(ll.size()-2);
        BigInteger ans= new BigInteger(s1);
        return f.add(s).equals(ans);
    }

    public static boolean nonleading(String s1){
        if(s1.length()==1){
            return true;
        }
        return s1.charAt(0) != '0';
    }
}
