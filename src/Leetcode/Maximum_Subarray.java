package Leetcode;

import java.util.Scanner;

public class Maximum_Subarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            ans=Math.max(ans,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return ans;
    }
}
