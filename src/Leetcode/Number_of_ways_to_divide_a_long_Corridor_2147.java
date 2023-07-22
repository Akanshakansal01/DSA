package Leetcode;

public class Number_of_ways_to_divide_a_long_Corridor_2147 {
    public static void main(String[] args) {
        String s = " PPSPSPPSPSPSSSS";
    }
    public static int no_Corridor(String s){
        int totalSeats=0;
        int seat=0;
        int plant=0;
        long ans=1;
        int mod= (int) ((1e9)+7);
        boolean first_Corridor=false;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='S'){
                totalSeats++;
                seat++;
            }
            else if(seat==0){
                plant++;
            }
            if(seat==2){
                if(first_Corridor){
                    ans = ans*(plant+1);
                    ans %= mod;
                }
                first_Corridor = true;
                seat = 0;
                plant = 0;
            }
        }
        if(totalSeats==0 || (totalSeats & 1)!=0){
            return 0;
        }
        return (int) ans;
    }
}
