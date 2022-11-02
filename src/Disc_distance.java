import java.util.Scanner;

public class Disc_distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        Printpath(0,n,"");
    }
    public  static void Printpath(int curr,int end,String ans)
    {
        if(curr==end)
        {
            System.out.println(ans);
            return;
        }
        if(curr>end)
        {
            return;
        }
        Printpath(curr+1,end,ans+1);
        Printpath(curr+2,end,ans+2);
        Printpath(curr+3,end,ans+3);
    }
}
