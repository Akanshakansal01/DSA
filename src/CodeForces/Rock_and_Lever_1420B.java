package CodeForces;

import java.util.Scanner;

public class Rock_and_Lever_1420B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(CountPair(arr));
        }
    }
    public static long CountPair(int[] arr){
        boolean visited[]= new boolean[arr.length];
        long ans=0;
        for(int i=31; i >= 0; i--){
            long c=0;
            for(int j=0;j< arr.length;j++){
                if((arr[j]&(1<<i))!=0 && !visited[j]){
                    c++;
                    visited[j]=true;
                }
            }
            ans = ans + (c*(c-1))/2;
        }
        return ans;
    }
}
