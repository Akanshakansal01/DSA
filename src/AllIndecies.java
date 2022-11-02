import java.util.ArrayList;
import java.util.Scanner;

public class AllIndecies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int ele=sc.nextInt();
        int i=0;
        int count=0;
        findallindices(arr,ele,i);
    }
    public static void findallindices(int[] arr,int ele,int i)
    {
        if(i> arr.length-1)
            return;
        if(arr[i]==ele)
            System.out.print(i+" ");
        findallindices(arr,ele,i+1);
    }
}
