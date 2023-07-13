package CodeForces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Two_Arrays_and_Sum_of_Functions_1165E {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            long[] arr = new long[n];
            for(int i=0; i<n; i++) {
                long temp = scan.nextLong();
                arr[i] = temp * (i+1) * (n-i);
            }
            int mod = 998244353;

            Long[] b = new Long[n];
            for(int i=0; i<n; i++) {
                b[i] = scan.nextLong();
            }

            Arrays.sort(arr);
            Arrays.sort(b, Collections.reverseOrder());

            long ans = 0;
            for(int i=0; i<n; i++) {
                ans += (((arr[i] % mod) * b[i]) % mod);
            }

            System.out.println(ans % mod);
            scan.close();
        }
}
