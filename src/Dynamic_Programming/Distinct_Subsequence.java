package Dynamic_Programming;
// leetcode  :  115 Distinct Subsequences
public class Distinct_Subsequence {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(numDistinct(s,t,0,0));
    }
    // i for s , j for t , s for coin , t for amount
    public static int numDistinct(String s,String t,int i,int j){
        if(j==t.length()){
            return i;
        }
        if(i==s.length()){
            return 0;
        }
        int inc=0,exc=0;
        if(s.charAt(i)==t.charAt(j)){
            inc=numDistinct(s,t,i+1,j+1);
        }
        exc= numDistinct(s,t,i+1,j);
        return inc+exc;
    }

}
