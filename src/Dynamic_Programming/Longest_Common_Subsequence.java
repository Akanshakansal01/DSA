package Dynamic_Programming;
// leetcode --->  Lowest Common Subsequence
import java.util.Arrays;

public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="ace";
        int dp[][]= new int[s1.length()][s2.length()];
        for(int a[]:dp)
            Arrays.fill(a,-1);
        System.out.println(lcs_TD(s1,s2,0,0,dp));
        System.out.println(lcs_BU(s1,s2));
//        for(int i=0;i<dp.length;i++){
//            for(int j=0;j<dp[0].length;j++){
//                dp[i][j]=-1;
//            }
//        }

//        System.out.println(lcs(s1,s2,0,0));
//        System.out.println(lcs2(s1,s2,s1.length()-1,s2.length()-1));
    }

    // Recursive Approach
    // i--> s1 , j--> s2
    public static int lcs(String s1,String s2,int i,int j){
        if(i==s1.length() || j==s2.length())
            return 0;
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans =1+lcs(s1,s2,i+1,j+1);
        }
        else{
            int fs=lcs(s1,s2,i+1,j);
            int ss=lcs(s1,s2,i,j+1);
            ans= Math.max(fs,ss);
        }
        return ans;
    }

    // Back recursion
    public static int lcs2(String s1,String s2,int i,int j){
        if(i<0 || j<0)
            return 0;
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans =1+lcs2(s1,s2,i-1,j-1);
        }
        else{
            int fs=lcs2(s1,s2,i-1,j);
            int ss=lcs2(s1,s2,i,j-1);
            ans= Math.max(fs,ss);
        }
        return ans;
    }

    // Top Down Approach
    public static int lcs_TD(String s1,String s2,int i,int j,int[][] dp){
        if(i==s1.length() || j==s2.length())
            return 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans =1+lcs_TD(s1,s2,i+1,j+1,dp);   // dp[i+1][j+1]
        }
        else{
            int fs=lcs_TD(s1,s2,i+1,j,dp);   // dp[i+1][j]
            int ss=lcs_TD(s1,s2,i,j+1,dp);    // dp[i][j+1]
            ans= Math.max(fs,ss);
        }
        return dp[i][j] = ans;
    }

    // Bottom Up Approach --> back recursion but table fill from starting
    public static int lcs_BU(String s1,String s2){
        int dp[][]= new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int ans=0;
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    ans = 1+dp[i-1][j-1];
                }
                else{
                    int fs=dp[i-1][j];
                    int ss=dp[i][j-1];
                    ans= Math.max(fs,ss);
                }
                dp[i][j]=ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

}
