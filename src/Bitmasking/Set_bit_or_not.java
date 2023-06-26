package Bitmasking;

public class Set_bit_or_not {
    public static void main(String[] args) {
        int n=84;
        int pos=4;
        System.out.println(set_or_not(n,pos));
    }
    public static boolean set_or_not(int n,int pos){
        int mask=(1<<pos);
        if((n& mask)>0){
            return true;
        }
        else
            return false;
    }
}
