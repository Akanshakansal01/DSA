import java.util.Scanner;

public class Queen_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// total board= 4
        int tq=sc.nextInt();// total queen= 2
        boolean [] board=new boolean[n];
        Printanswer(board,tq,0,"");
    }
    public static void Printanswer(boolean[] board,int tq,int qpsf,String ans)    // qpsf=queen place so far
    {
        if(qpsf==tq)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i]==false)
            {
                board[i]=true;
//                qpsf+=1;
//                Printanswer(board,tq,qpsf,ans+"b"+i+"q"+qpsf);
//                qpsf-=1;
              Printanswer(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
                board[i]=false;                // explicitly undo           // backtracking statement
                                               // In backtracking we do forcefully undo
            }
        }
    }
}
