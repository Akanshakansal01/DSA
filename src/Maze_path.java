import java.util.Scanner;

public class Maze_path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        Printpath(m-1,n-1,0,0,"");
        System.out.println(k);
    }
    static int k=0;

    public static int Printpath(int er, int ec, int cr, int cc, String ans)
    {
        if(cc==ec && cr==er)
        {
            System.out.println(ans+" ");
            k++;
           return k;
        }
        if(cc>ec || cr>er)
        {
            return k ;
        }
        Printpath(er,ec,cr,cc+1,ans+"H");
        Printpath(er,ec,cr+1,cc,ans+"V");
        return k;
    }
}
