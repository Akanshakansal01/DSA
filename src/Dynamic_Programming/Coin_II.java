package Dynamic_Programming;
//  leetcode  :  518  Coin Change II
public class Coin_II {
    public static void main(String[] args) {
        int amount = 5;
        int coin[] = {1,2,5};
        System.out.println(Coin_Change(coin,amount,0));
        System.out.println(Coin_ChangeII(coin,amount));
    }
    public static int Coin_Change(int[] coin,int amount,int idx)
    {
        if(amount==0){
            return 1;
        }
        if(idx==coin.length){
            return 0;
        }
        int inc=0,exc=0;  // inclusion and exclusion
        if(coin[idx]<=amount){
            inc= Coin_Change(coin,amount-coin[idx],idx);
        }
        exc= Coin_Change(coin,amount,idx+1);
        return inc+exc;
    }
    public static int Coin_ChangeII(int []coin,int amount){
        int [][] dp= new int[coin.length+1][amount+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<dp.length;i++){
            for(int am=1;am<dp[0].length;am++){
                int inc=0,exc=0;  // inclusion and exclusion
                if(coin[i-1]<=am){
                    inc= dp[i][am-coin[i-1]];
                }
                exc= dp[i-1][am];
                dp[i][am]=inc+exc;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
