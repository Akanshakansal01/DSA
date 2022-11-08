import java.util.Scanner;

public class Dec_To_Oct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int mul=1;
        while(n>0)
        {
            int rem=n%8;
            s += rem*mul;
            n=n/8;
            mul*=10;
        }
        System.out.println(s);
    }
}
