package CodeForces;

public class Catalan_Number {
    public static void main(String[] args) {
        int n=3;
    }
    public static int Catalan_number(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            ans= ans + Catalan_number(i-1) * Catalan_number(n-i);
        }
        return ans;

    }
}
