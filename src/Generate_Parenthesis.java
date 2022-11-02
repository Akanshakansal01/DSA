import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> res=new ArrayList();
        generateParenthesis(n,0,0,"",res);
        System.out.print(res);
    }
    public static void generateParenthesis(int n,int open,int close,String ans,List<String> list)
    {
        if(open==n && close==n)
        {
            list.add(ans);
            return;
            //System.out.println(ans);
        }
        if (open < n) {
            generateParenthesis(n, open + 1, close, ans + "(",list);
        }
        if (close < open) {
            generateParenthesis(n, open, close + 1, ans + ")",list);
        }
    }
}
