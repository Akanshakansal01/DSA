import java.util.Scanner;

public class PermutationOfCoin
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        coinPermutation(n,"");
    }
    public static void coinPermutation(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        coinPermutation(n-1,ans+"H");
        coinPermutation(n-1,ans+"T");
    }
}
