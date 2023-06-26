package Bitmasking;

public class Single_Number_III {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,5};
        single_number_III(arr);
    }
    public static void single_number_III(int arr[]){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        int mask = (ans & (~(ans - 1)));// 010
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((mask & arr[i]) != 0) {
                a = a ^ arr[i];
            }
        }
        int b = a ^ ans;
        System.out.println(a + " " + b);
    }
}
