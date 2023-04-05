package Dynamic_Programming;

public class Fibo {

    // Recursive Approach ime Complexity - 2^n
    public static int fibonacci_rec(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1=fibonacci_rec(n-1);
        int f2=fibonacci_rec(n-2);
        return f1+f2;
    }

    // Top down Approach : Time Complexity - O(n) , Space Complexity : O(n+1)
    public static int fibonacci_TD(int n,int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){  // Apply dp
            return dp[n];
        }
        int f1=fibonacci_TD(n-1,dp);  // dp[n-1]
        int f2=fibonacci_TD(n-2,dp);  // dp[n-2]
        return dp[n]=f1+f2;             // dp[n]= dp[n-1]+dp[n-2]
    }

    // Bottom Up Approach  ime Complexity - O(n) ,
    public static int fibonacci_BU(int n){
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=150;
        int [] dp= new int[n+1];
        System.out.println(fibonacci_TD(n,dp));
        System.out.println(fibonacci_BU(n));
        System.out.println(fibonacci_rec(n));

    }

}
