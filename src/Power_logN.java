public class Power_logN {
    public static void main(String[] args) {
        int a=3,b=9;
        System.out.println(Power(a,b));
    }

    public static int Power(int a,int b)
    {
        if(b==0)
            return 1;
        int ans=Power(a,b/2);
        if(b%2==0)
            return ans*ans;
        else
            return ans*ans*a;
    }
}
