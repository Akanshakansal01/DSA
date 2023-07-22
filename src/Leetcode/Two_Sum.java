package Leetcode;

import java.util.Scanner;

public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int target= sc.nextInt();
        int [] result = two_sum(arr,n,target);
        System.out.println(arr[result[0]]+","+arr[result[1]]);
    }
    public static int[] two_sum(int[] nums,int n,int target){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((nums[i]+nums[j])==target){
                    return new  int[] {i,j};
                }
            }
        }
        return null;
    }
}
