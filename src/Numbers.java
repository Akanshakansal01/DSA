 import java.util.Scanner;

    public class Numbers {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            number(n);
        }
        public static void number(int n)
        {
//		base condition
//		if(n==0)
//			return;
            if(n>0)
            {
                number(n-1);
                System.out.println(n);
            }
        }
    }
