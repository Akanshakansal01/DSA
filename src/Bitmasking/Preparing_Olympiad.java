package Bitmasking;

import java.util.Scanner;

public class Preparing_Olympiad {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();// 3
        int l=sc.nextInt();// 5
        int r=sc.nextInt();// 6
        int x=sc.nextInt();// 1
        int arr[]=new int[n]; // {1,2,3}
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(countcontest(arr,l,r,x));
    }

    public static int countcontest(int[] arr,int l,int r,int x){
        int n= arr.length;
        int ans=0;
        for(int i=0;i<(1<<n);i++){
            if(countsetbits(i)>=2){
                if(isitpossible(arr,l,r,x,i)){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static boolean isitpossible(int[] arr,int l,int r,int x,int i){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int pos=0;
        while(i>0){
            if((i &1)!=0){
                sum += arr[pos];
                min = Math.min(min,arr[pos]);
                max = Math.max(max,arr[pos]);
            }
            i >>= 1;
            pos++;
        }
        return (sum >= l && sum<=r &(max-min)>=x);
    }

    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            n=(n&(n-1));
            count++;
        }
        return count;
    }
}
