// bitwise operator is 2 or 3  times faster than arithmetic or logical operator

package Bitmasking;

public class ODD_EVEN {
    public static void main(String[] args) {
        int n=792;
        if((n & 1)>0){
            System.out.println("ODD");
        }
        else {
            System.out.println("EVEN");
        }
    }
}
