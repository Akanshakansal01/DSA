// leetcode 131
//import java.util.Scanner;
//
//public class PalindromePartitioning {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();  // nitin
//        Partitioning(str,"");
//    }
//    public static void Partitioning(String ques,String ans)
//    {
//        if(ques.length()==0)
//        {
//            System.out.println(ans);
//            return;
//        }
//        for(int cut=1;cut<=ques.length();cut++)
//        {
//            String s1=ques.substring(0,cut);
//            if(isPalindrome(s1))
//                Partitioning(ques.substring(cut),ans+s1+"|");
//        }
//    }
//    public static boolean isPalindrome(String s)
//    {
//        int i=0;
//        int j=s.length()-1;
//        while(i<j)
//        {
//            if(s.charAt(i)!=s.charAt(j))
//                return false;
//            i++;
//            j--;
//        }
//       return true;
//    }
//}


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        String str=sc.nextLine();  // nitin
        Partitioning(str,list,ans);
        System.out.println(ans);
    }
    public static void Partitioning(String ques,List<String> list,List<List<String>> ans)
    {
        if(ques.length()==0)
        {
            //System.out.println(list);
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int cut=1;cut<=ques.length();cut++)
        {
            String s1=ques.substring(0,cut);
            if(isPalindrome(s1)) {
                list.add(s1);
                Partitioning(ques.substring(cut), list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
    public static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
