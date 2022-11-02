import java.util.Scanner;

public class Suduko_Solver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        solveSuduko(arr,0,0);
    }
    public static void solveSuduko(int[][] grid,int row,int col)
    {
        if(row==grid.length) {
            Display(grid);
            return;
        }
        int next_row=0,next_col=0;
        if(col== grid.length-1)
        {
            next_row=row+1;
            next_col=0;
        }
        else
        {
            next_row=row;
            next_col=col+1;
        }
        if(grid[row][col]!=0)
        {
            solveSuduko(grid,next_row,next_col);
        }
        else
        {
            for(int i=1;i<= grid.length;i++)
            {
                if(isValid(grid,row,col,i)==true)
                {
                    grid[row][col]=i;
                    solveSuduko(grid,next_row,next_col);
                    grid[row][col]=0;
                }
            }
        }
    }
    public static boolean isValid(int board[][],int x,int y,int val)
    {
        for(int j=0;j< board[0].length;j++)  // for column
        {
            if(board[x][j]==val)
                return false;
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i][y]==val)
                return false;
        }
//        3*3 matrix
        int submatrix1= x/3*3;
        int submatrix2= y/3*3;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[submatrix1+i][submatrix2+j]==val)
                    return false;
            }
        }
        return true;
    }
    public static void Display(int[][] ans)
    {
        for(int i=0;i<ans.length;i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}



























//class Sudoko_Solver {
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
////        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
////                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
////                { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[][] grid =new int[n][n];
//        for(int i=0;i<n;i++)
//        {
//            String str=sc.next();
//            for(int j=0;j<str.length();j++)
//            {
//                grid[i][j]=str.charAt(j);
//            }
//        }
//        Sudoku(grid, 0, 0,n);
//    }
//    public static void Sudoku(int[][] grid, int row, int col,int n) {
//        if (col == n) {
//            row++;
//            col = 0;
//        }
//        if (row == n) {
//            Display(grid);
//            return;
//        }
//
//        if (grid[row][col] != 0) {
//            Sudoku(grid, row, col + 1,n);
//        }
//
//        else {
//
//            for (int val = 1; val <= n; val++) {
//                if (isitpossible(grid, row, col, val) == true) {
//
//                    grid[row][col] = val;
//                    Sudoku(grid, row, col + 1,n);
//                    grid[row][col] = 0;
//                }
//
//            }
//
//        }
//
//    }
//
//    public static boolean isitpossible(int[][] grid, int row, int col, int val) {
//        // row
//        int c = 0;
//        while (c < grid.length) {
//            if (grid[row][c] == val) {
//                return false;
//            }
//            c++;
//        }
//
//        // col
//        int r = 0;
//        while (r < grid.length) {
//            if (grid[r][col] == val) {
//                return false;
//            }
//            r++;
//        }
//
//        // 3*3 Matrix
//        r = row - row % 3;
//        c = col - col % 3;
//        for (int i = r; i < r + 3; i++) {
//            for (int j = c; j < c + 3; j++) {
//                if (grid[i][j] == val) {
//                    return false;
//                }
//
//            }
//
//        }
//
//        return true;
//    }
//
//    public static void Display(int[][] grid) {
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid.length; j++) {
//                System.out.print(grid[i][j]+" ");
//            }
//            System.out.println();
//
//        }
//
//    }
//}