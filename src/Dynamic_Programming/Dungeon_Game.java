// leetcode 174 : Dungeon GAme
package Dynamic_Programming;

public class Dungeon_Game {
    public static void main(String[] args) {
        int [][] arr={{-2,-3,3},{-5,-10,1},{10,30,-5}};
        int dp[][]=new int[arr.length][arr[0].length];
        System.out.println(calculateMinimum(arr,0,0,dp));
    }
    public static int calculateMinimum(int[][] dungeon,int curr_row,int curr_col,int dp[][]){
        if(curr_row==dungeon.length || curr_col==dungeon[0].length){
            return Integer.MAX_VALUE;
        }
        if(curr_row==dungeon.length-1 && curr_col==dungeon[0].length-1){
            return dungeon[curr_row][curr_col]>0 ? 1: 1-dungeon[curr_row][curr_col];
        }
        if(dp[curr_row][curr_col]!=-1){
            return dp[curr_row][curr_col];
        }
        int right=calculateMinimum(dungeon,curr_row,curr_col+1,dp);
        int down=calculateMinimum(dungeon,curr_row+1,curr_col,dp);
        int hp=Math.min(right,down)-dungeon[curr_row][curr_col];
        return dp[curr_row][curr_col]=hp>0 ? hp:1;
    }
}
