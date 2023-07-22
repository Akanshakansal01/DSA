package Leetcode;

import java.util.Scanner;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String st[]= new String[n];
        for(int i=0;i<n;i++){
            st[i] = sc.next();
        }
        System.out.println(longestCommonPrefix(st));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String common_prefix=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(common_prefix)!=0)
            {
                common_prefix=common_prefix.substring(0,common_prefix.length()-1);
            }
        }
        return common_prefix;
    }
}
