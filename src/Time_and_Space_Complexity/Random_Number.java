package Time_and_Space_Complexity;

import java.util.Random;

public class Random_Number {
    public static void main(String[] args) {
        int low=10;
        int high=100;
        Random rand = new Random();
        for(int i=0;i<40;i++)
        {
            int rn=rand.nextInt(high-low+1)+low;
            System.out.print(rn+" ");
        }
    }
}
