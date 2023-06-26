package Bitmasking;

public class Single_Number {
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        System.out.println(single_number(arr));
    }
    public static int single_number(int arr[]){
        int ans=0;
        for(int num:arr){
            ans=ans^num;
        }
        return ans;
    }
}
