//  leetcode 935
package Dynamic_Programming;

import java.util.Arrays;

public class Knight_Dialer {
    public static void main(String[] args) {
        int n=2;
        long ans=0;
        int [][][] dp= new int[n][4][3];
        for(int[][] arr:dp){
            for(int[] a:arr){
                Arrays.fill(a,-1);
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                ans = (ans+count(n-1,i,j,dp))%1000_000_007;
            }
        }
        System.out.println(ans);
//        return (int)(ans%1000_000_007);
    }
    public static int count(int n,int curr_row,int curr_col,int [][][]dp){
        if((curr_col<0 || curr_row<0 || curr_row>=4 || curr_col>=3 ) || (curr_row==3 && curr_col==0) || (curr_row==3 && curr_col==2)){
            return 0;
        }
         if(n==0){
             return 1;
         }
         if(dp[n][curr_row][curr_col]!=-1){
             return dp[n][curr_row][curr_col];
         }
        int [] row={-2,-2,2,2,-1,1,-1,1};
        int [] col={-1,1,-1,1,-2,-2,2,2};
        long ans=0;
        for(int i=0;i<col.length;i++){
            ans += count(n-1,curr_row+row[i],curr_col+col[i],dp)%1000_000_007;
        }
        return dp[n][curr_row][curr_col]= (int)(ans%1000_000_007);
    }
}
