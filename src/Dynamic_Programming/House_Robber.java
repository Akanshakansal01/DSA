package Dynamic_Programming;

//  leetcode 198. House Robber

import java.util.*;

public class House_Robber {
    public static void main(String[] args) {
        int arr[]={2,7,9,3,1};
        int[] dp=new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(Robber(arr,0));
        System.out.println(Robber_TD(arr,0,dp));
        System.out.println(Robber_BU(arr));
    }

    // recursion
    public static int Robber(int[] arr,int i){
        if(i>= arr.length){
            return 0;
        }
        int rob=arr[i]+Robber(arr,i+2);
        int doNotRob= Robber(arr,i+1);
        return Math.max(rob,doNotRob);
    }

    // Top down
    public static int Robber_TD(int[] arr,int i,int[] dp){
        if(i>= arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob=arr[i]+Robber_TD(arr,i+2,dp);
        int doNotRob= Robber_TD(arr,i+1,dp);
        return dp[i]=Math.max(rob,doNotRob);
    }

    // Bottom Up
    public static int Robber_BU(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int[] dp=new int[arr.length];
        dp[0]= arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<dp.length;i++){
            int rob=arr[i]+dp[i-2];
            int doNotRob=dp[i-1];
            dp[i]=Math.max(rob,doNotRob);
        }
        return dp[arr.length-1];
    }
}
