import java.util.Scanner;

public class CoinToss {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        coin(n,"");
    }
    public static void coin(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
            coin(n - 1, ans + "H");
        }
        coin(n-1,ans+"T");
    }
}
