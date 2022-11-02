import java.util.Scanner;

public class CountSubSequence {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int x[]=new int[10];
        int query[]=new int[q];
        for(int i=0;i<=9;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int j=0;j<q;j++)
        {
            query[j]=sc.nextInt();
        }
        for(int i=0;i<q;i++)
           System.out.println(vaccine(x,query));
    }
    public static int vaccine(int arr[],int query[])
    {
        int sum=0,c=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(query[i]>=sum)
            {
                c++;
                break;
            }
            return c;
        }
        return c;
    }
}
