import java.util.Scanner;

public class REverseNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverse(n);
    }
    public static void reverse(int n)
    {
//		base condition
//		if(n==0)
//			return;
        if(n>0)
        {
            // head recursion
            System.out.println(n);
            reverse(n-1);

        }
    }
}
