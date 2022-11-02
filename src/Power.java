import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(power(n,x));
        System.out.println(power(n,x,1));
    }
    // Head recursion
    public static int power(int n,int x)
    {
        if(x==0)
            return 1;
        return power(n,x-1)*n;
    }
    // Tail recursion
    public static int power(int n,int x,int ans)
    {
        if(x==0)
            return ans;
        return power(n,x-1,ans*n);
    }
}
