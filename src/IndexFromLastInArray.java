import java.util.Scanner;

public class IndexFromLastInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int ele=sc.nextInt();
        System.out.println(index(arr,ele,n-1));
    }
    public static int index(int arr[],int ele,int i)
    {
        if(i==-1)     // if(i<0)
            return -1;
        if(arr[i]==ele)
            return i;
        return index(arr,ele,i-1);
    }
}
