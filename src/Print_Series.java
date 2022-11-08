/*  take A number (N1), A number (N2)
    Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.
 */
import java.util.Scanner;

public class Print_Series {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N1 = s.nextInt();
        int N2 = s.nextInt();
        if (N1 < 0 || N1 >= 100 || N2 < 0 || N2 >= 100) {

            return;
        }
        for (int i = 1; N1>0; i++)
        {
            int values=(3*i)+2;
            if(values%N2!=0)
            {
                System.out.println(values);
                N1--;
            }
        }
    }
}
