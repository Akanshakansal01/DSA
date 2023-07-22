package Leetcode;

import java.util.Scanner;

public class Reverse_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(reverse(n));
    }
    public static int reverse(int x){
        boolean isNegative = false;
        if(x<0){
            isNegative =true;
            x = -x;
        }
        long rev=0;
        while (x>0){
            long rem = x%10;
            rev = rev*10 +rem;
            x = x/10;
        }
        if(rev > Integer.MAX_VALUE) {
            return 0;
        }
        else {
            return (int) (isNegative ? -rev:rev);
        }
    }
}
