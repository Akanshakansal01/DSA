/*  Cell Mitosis
There's a scientist named Brook who is interested in budding of cells. He has one container which initially contains only a single cell.
Now Brook wants n number of cells in his container.So he can change the number of cells in container in 3 different ways -:

    Double the number of cells present in the container.
    Increase the number of cells in the container by 1.
    Decrease the number of cells in the container by 1.

Now, all the above operations have different costs associated with them x,y,z respectively for above operations.
Help brook in finding the minimum cost to generate n cells in the container starting from one cell .

Input format :-
    Each test case contains 2 lines.
    First lines contains an integer n
    Second lines contains 3 space separated integers x, y, and z

Output format :-
    Output an integer denoting the minimum cost incurred to create n cells

Example 1 :
    Input                                      Output
    5                                           4
    2 1 3

Explanation :-
    Initial number of cell is 1. Applying 2nd operations four times will give 5 cells in the container , and its total cost will be 1x4 = 4.
    One other way to do is - first adding a single cell with operation 2nd ,then doubling the cells , and then again adding one more cell ,
    with cost = 1+2+1 =4.

Constraints :-
    1<=n<=10^5
    1<=x<=y<=z<=10^5
 */

package Dynamic_Programming;

import java.util.Scanner;

public class Cell_Mitosis {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println(min_cost(x,y,z,n));
    }
//     bottom up approach
    public static long min_cost(int x,int y,int z,int n){
        long[] dp= new long[n+1];
        for(int i=2;i<dp.length;i++){
            if(i%2==0){
                dp[i]=Math.min(dp[i/2]+x,dp[i-1]+y);
            }
            else{
                dp[i]=Math.min(dp[(i+1)/2]+x+z,dp[i-1]+y);
            }
        }
        return dp[n];
    }
}
