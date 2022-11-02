import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        char maze[][]=new char[n][m];
        for(int i=0;i<n;i++)
        {
            String str=sc.next();
            for(int j=0;j<str.length();j++)
            {
                maze[i][j]=str.charAt(j);
            }
        }
        int[][] ans=new int[n][m];
        solveMaze(maze,0,0,ans);
    }

    public static void solveMaze(char[][] maze,int cc,int cr,int[][] ans)
    {

    }
}
