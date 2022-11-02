import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n,1));
    }
    public static int fact(int n,int ans)
    {
        // head recursion
//        if(n==0)
//            return 1;
//        int fn=fact(n-1);
//        return n*fn;
        // tail recursion
        if(n==0)
        {
            return ans;
        }
        return fact(n-1,ans*n);
    }
}

