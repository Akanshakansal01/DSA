package Bitmasking;

public class Single_Number_ii {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1,99};
    }
    public static int singleNumber(int[] arr) {
        int [] bit=new int[32];
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            int pos=0;
            while(num>0){
                if((num&1)>0){
                    bit[pos]++;
                }
                pos++;
                num>>=1;
            }
        }
        for (int i = 0; i < bit.length; i++) {
            bit[i] %= 3;
        }
        return 0;
    }
}
