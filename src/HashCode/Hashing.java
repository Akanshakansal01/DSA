package HashCode;

public class Hashing {
    public static void main(String[] args) {
        String s= "apple";
        System.out.println(hasCode(s));
    }
    public static long hasCode(String s){
        long mod=1000_000_007;
        int pr=31;
        long ans=0;
        long pow=1;
        for (int i = 0; i < s.length(); i++){
            char ch=s.charAt(i);
            ans=(ans+((ch-'a'+1)*pow)%mod)%mod;
            ans=(ans+mod)%mod;
            pow=(pow*pr)%mod;
        }
        return ans;
    }
}
