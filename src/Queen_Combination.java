import java.util.Scanner;

public class Queen_Combination{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// total board= 4
        int tq=sc.nextInt();// total queen= 2
        boolean [] board=new boolean[n];
        printanswer(board,0,tq,0,"");
    }
    public static void printanswer(boolean[] board,int idx,int tq,int qpsf,String ans)    // qpsf=queen place so far
    {
        if(qpsf==tq)
        {
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<board.length;i++)
        {
            if(board[i]==false)
            {
                board[i]=true;
                printanswer(board,i+1,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
                board[i]=false;
            }
        }
    }
}
