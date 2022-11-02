import java.util.Scanner;

public class Count_Sequence {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
         permutation(str,"");
        System.out.println(count);
    }
    public static int permutation(String ques, String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            count++;
            return 1 ;
        }
        char ch=ques.charAt(0);
        int f1=permutation(ques.substring(1),ans);
        int f2=permutation(ques.substring(1),ans+ch);
        return f1+f2;
    }
//    public static void permutation(String ques, String ans)
//    {
//        if(ques.length()==0)
//        {
//            System.out.println(ans);
//            count++;
//            return ;
//        }
//        char ch=ques.charAt(0);
//        permutation(ques.substring(1),ans);
//        permutation(ques.substring(1),ans+ch);
//    }
}
