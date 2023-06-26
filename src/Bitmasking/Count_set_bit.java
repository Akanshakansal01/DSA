package Bitmasking;

public class Count_set_bit {
    public static void main(String[] args) {
        int n=67;
        System.out.println(count_set_bit(n));
        System.out.println(FastCountSet(n));
    }
    public static int count_set_bit(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int FastCountSet(int n) {
        int count = 0;
        while (n > 0) {
            n = (n & (n - 1));
            count++;
        }
        return count;
    }
}
