import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Letter_Tile_Possibilities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // ABAC
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++)
        {
            int idx=str.charAt(i)-'A';
            freq[idx]++;      // freq[idx]=freq[idx]+1
        }
//        for(int i=0;i<freq.length;i++)
//        {
//            System.out.print(freq[i]+" ");     // 2 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
//        }

        System.out.println(Tile_Possibilities(freq,""));
    }
    public static int Tile_Possibilities(int[] freq,String ans)
    {
        //System.out.println(ans);
        int count=0;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>=1)
            {
                char ch=(char)(i+'A');
                freq[i]--;
                count+=Tile_Possibilities(freq,ans+ch)+1;
                freq[i]++;
            }
        }
        return count;
    }
}
