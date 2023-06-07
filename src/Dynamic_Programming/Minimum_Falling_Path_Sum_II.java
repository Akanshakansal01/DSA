package Dynamic_Programming;
// leetcode :   1289. Minimum Falling Path Sum II
public class Minimum_Falling_Path_Sum_II {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr[0].length;i++){
            ans=Math.min(ans,Falling_Path_SumII(arr,0,i));
        }
        System.out.println(ans);
    }
    public static int Falling_Path_SumII(int[][] arr,int i,int j){
        if(i== arr.length-1){
            return arr[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for(int col=0;col<arr[0].length;col++){
            if(col!=j){
                ans=Math.min(ans,Falling_Path_SumII(arr,i+1,col));
            }
        }
        return ans+arr[i][j];
    }
}
