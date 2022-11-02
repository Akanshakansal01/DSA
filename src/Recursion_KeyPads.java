import java.util.Scanner;

public class Recursion_KeyPads {
    static String[] key={"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();// str= "12"
        printKeyPads(str,"");
        System.out.println("\n"+k);
    }
    static int k=0;
    public static int printKeyPads(String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.print(ans+" ");
            k++;
            return k;
        }
        char ch=ques.charAt(0); // ch= '1' ----> 49 ascii value
        String pressString=key[ch-48];// 48 ascii value of 0
        for(int i=0;i<pressString.length();i++)
        {
            printKeyPads(ques.substring(1),ans+pressString.charAt(i));
        }
        return k;
    }
}
