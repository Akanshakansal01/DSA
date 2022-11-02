import java.util.Scanner;

class Lexicographical_Order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LexicoCounting(0,n);
    }
    public static void LexicoCounting(int curr,int n)
    {
        if(curr>n) {
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0)
        {
            i=1;
        }
        for(;i<=9;i++)
        {
            LexicoCounting(curr*10+i,n);
        }
    }
}
