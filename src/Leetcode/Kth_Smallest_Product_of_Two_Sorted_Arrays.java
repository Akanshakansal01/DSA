package Leetcode;

public class Kth_Smallest_Product_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int arr1[]={-4,-2,0,3};
        int arr2[]= {2,4};
        int k=6;
        System.out.println(KthProduct(arr1,arr2,k));
    }
    public static long KthProduct(int []arr1,int[] arr2,long k){
        long si = -1000_000_0000l;
        long ei = 1000_000_0000l;
        long ans=0;
        while(si<=ei){
            long mid = (si+ei)/2;
            if(countOfProduct(arr1,arr2,mid)>=k){
                ans = mid;
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        return ans;
    }
    public static long countOfProduct(int[] arr1,int[] arr2,long product){
        long ans=0;
        for(int ei:arr1){
            if(ei>=0){
                long count=0;
                int lo=0;
                int hi= arr2.length-1;
                while(lo<=hi){
                    int mid=(lo+hi)/2;
                    if((long)(ei)*arr2[mid]<=product){
                        count=mid+1;
                        lo=mid+1;
                    }
                    else{
                        hi=mid-1;
                    }
                }
                ans += count;
            }
            else{
                long count=0;
                int lo=0;
                int hi= arr2.length-1;
                while(lo<=hi){
                    int mid=(lo+hi)/2;
                    if((long)(ei)*arr2[mid]<=product){
                        count=arr2.length-mid;
                        hi=mid-1;
                    }
                    else{
                        lo=mid+1;
                    }
                }
                ans += count;
            }
        }
        return ans;
    }

}
