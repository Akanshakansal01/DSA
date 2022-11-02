package Time_and_Space_Complexity;

public class Time_and_Space_Demo {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
        {

        }
        long end=System.currentTimeMillis();
        System.out.println(end);
        System.out.println(start);
        System.out.println(end-start);
    }
}

//  Asymtotic Notation
/* 1. Best case (omega)
   2. Average case (theta)
   3. Worst case (Big oh)
 */
