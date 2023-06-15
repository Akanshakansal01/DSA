package Bitmasking;

public class Shift_OPr {
    public static void main(String[] args) {
        int n=5;
        System.out.println(n>>1);
        System.out.println(n<<1);
        int m=-5;
        System.out.println(m>>1);
        System.out.println(m<<1);
    }
}
 //In right shift for negative no first calculate the 2's completement of the number then drop the last bit out of 32 bit and then again
// calculate the 2's complement of that number after that we got the resultant number.
// e.g., n=-5  ( 000000000000000000000000 00000101 )  --> 2's complement : 111111111111111111111111 11111010
// after drop last bit --> _111111111111111111111111 1111101 again 2's complement :- 100000000000000000000000 0000011
// starting bit represent that no. is negative and the number is 3
// so, -5 >> 1 = -3