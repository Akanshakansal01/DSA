package Bitmasking;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class I_Coins_AtCoder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();           //  3
        double[] arr= new double[n]; // {0.30,0.60, 0.80}
        double[][] dp=new double[(n+4)/2][n];
        for(double[] d: dp){
            Arrays.fill(d,-1);
        }
        for(int i=0;i<n;i++){
            arr[i]= sc.nextDouble();
        }
        System.out.println(Answer(arr,0,(n+1)/2,dp));
    }
    public static double Answer(double[] p,int i,int h,double[][] dp){   // here, h for headcount
        if(h==0){
            return 1;
        }
        if(i==p.length){
            return 0;
        }
        if(dp[h][i]!=-1){
            return dp[h][i];
        }
        double ans= p[i]*Answer(p,i+1,h-1,dp)+(1-p[i])*Answer(p,i+1,h,dp);
        return dp[h][i] = ans;
    }
}
