/* Once again Tavas started eating coffee mix without water! Keione told him that it smells awful, but he didn't stop doing that.
That's why Keione told his smart friend, SaDDas to punish him! SaDDas took Tavas' headphones and told him:
"If you solve the following problem, I'll return it to you."
The problem is:
    You are given a lucky number n. Lucky numbers are the positive integers whose decimal representations contain only the lucky digits 4 and 7.
    For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.
    If we sort all lucky numbers in increasing order, what's the 1-based index of n?
    Tavas is not as smart as SaDDas, so he asked you to do him a favor and solve this problem so he can have his headphones back.

Input
    The first and only line of input contains a lucky number n (1 ≤ n ≤ 109).

Output
    Print the index of n among all lucky numbers.
input
4
output
1

 */
package Bitmasking;

import java.util.Scanner;

public class Tavas_and_SaDDas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Index(str));
    }

    public static int Index(String str) {
        int n = str.length();
        int count = (1 << n) - 2;// n-1 tk ka saare lucky number ka count h
        int pos = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '7') {
                count = count + (1 << pos);
            }
            pos++;
        }
        return count + 1;

    }
}
