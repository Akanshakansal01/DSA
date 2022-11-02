import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printpermutation(str,"");
    }
    public static void printpermutation(String ques, String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        printpermutation(ques.substring(1),ans);
        printpermutation(ques.substring(1),ans+ch);
    }
}
