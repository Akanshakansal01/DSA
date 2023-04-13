package Dynamic_Programming;

import java.util.Arrays;

// leetcode :  1458. Max Dot Product of Two Subsequences
public class Max_Dot_Product_of_Two_Subsequences {
    public static void main(String[] args) {
        int arr1[]={1,1};
        int arr2[]={-1,-1};
        int [][] dp= new int[arr1.length][arr2.length];
        for(int[]a:dp){
            Arrays.fill(a,-100000000);
        }
        System.out.println(Product(arr1,arr2,0,0,true));
        System.out.println(Product1(arr1,arr2,0,0,true,dp));
        System.out.println(Product_BU(arr1,arr2));
    }
        // recursion
    public static int Product(int arr1[],int arr2[],int i,int j,boolean flag){
        if(i==arr1.length || j== arr2.length){
            if(flag)
                return 0;
            else
                return -10000000;
        }
        int dot=arr1[i]*arr2[j]+Product(arr1,arr2,i+1,j+1,true);
        int fd=Product(arr1,arr2,i+1,j,false);         // firstdelete
        int sd= Product(arr1,arr2,i,j+1,false);         // secondDelete
        return Math.max(arr1[i]*arr2[j],Math.max(dot,Math.max(fd,sd)));
    }

    // top down
    public static int Product1(int arr1[],int arr2[],int i,int j,boolean flag,int[][] dp){
        if(i==arr1.length || j== arr2.length){
            if(flag)
                return 0;
            else
                return -10000000;
        }
        if(dp[i][j]!= -100000000){
            return dp[i][j];
        }
        int dot=arr1[i]*arr2[j]+Product1(arr1,arr2,i+1,j+1,true,dp);   // dp[i-1][j-1]
        int fd=Product1(arr1,arr2,i+1,j,false,dp);         // dp[i-1][j]
        int sd= Product1(arr1,arr2,i,j+1,false,dp);         // dp[i][j-1]
        return dp[i][j] = Math.max(arr1[i]*arr2[j],Math.max(dot,Math.max(fd,sd)));
    }

    // bottom up
    public static int Product_BU(int arr1[],int arr2[]){
        int [][] dp= new int[arr1.length+1][arr2.length+1];
        // special case
        int sp=Integer.MIN_VALUE;
        for(int i=1;i< dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int dot=arr1[i-1]*arr2[j-1]+dp[i-1][j-1];
                int fd= dp[i-1][j];
                int sd= dp[i][j-1];
                dp[i][j] = Math.max(arr1[i-1]*arr2[j-1],Math.max(dot,Math.max(fd,sd)));
                sp=Math.max(sp,arr1[i-1]*arr2[j-1]);
            }
        }
        if(dp[dp.length-1][dp[0].length-1]==0){
            return sp;
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
