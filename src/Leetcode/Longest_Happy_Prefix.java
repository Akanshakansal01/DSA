package Leetcode;
//  1392. Longest Happy Prefix

import java.util.Scanner;

public class Longest_Happy_Prefix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        System.out.println(lps(str));
    }
    public static String lps(String str) {
        int[] dp= new int[str.length()];
        int len=0;
        for(int i=1;i<dp.length;){
            if(str.charAt(len)==str.charAt(i)){
                len++;
                dp[i]=len;
                i++;
            }
            else{
                if(len>0){
                    len=dp[len-1];
                }
                else {
                    dp[i] = 0;
                    i++;
                }
            }
        }
//        return str.substring(str.length()-len, str.length());
        return str.substring(0,dp[str.length()-1]);
    }
}

//  lps-->  longest common prefix which is also suffix
