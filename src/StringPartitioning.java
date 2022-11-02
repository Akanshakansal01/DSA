import java.util.Scanner;

public class StringPartitioning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();  // nitin
        partitioning(str,"");
    }
    public static void partitioning(String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int cut=1;cut<=ques.length();cut++)
        {
            String s1=ques.substring(0,cut);
            partitioning(ques.substring(cut),ans+s1+"|");
        }
    }
}
