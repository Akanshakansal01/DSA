//  leetcode 51  ( N_Queens )
import java.util.Scanner;

public class N_Queen {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  // n=4;
        boolean board[][]=new boolean[n][n];
        Queen(board, n, 0);
        System.out.println(count);
    }
    public static void Queen(boolean[][] board,int tq,int row)
    {
        if(tq==0)
        {
//            Display(board);
            count++;
            return;
        }
        for(int i=0;i<board.length;i++)  // column loop
        {
            if(issafe(board,row,i)==true)
            {
                board[row][i]=true;
                Queen(board,tq-1,row+1);
                board[row][i]=false;
            }
        }
    }
    public static boolean issafe(boolean[][] board,int row,int col)
    {
        int r = row;
        // vertical
        while (r >= 0) {
            if (board[r][col] == true) {
                return false;
            }
            r--;
        }

        // left Diagonal
        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == true) {
                return false;
            }
            c--;
            r--;
        }
        // left Diagonal
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == true) {
                return false;
            }
            c++;
            r--;
        }
        return true;
    }
//    public static void Display(boolean[][] board)
//    {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
}
