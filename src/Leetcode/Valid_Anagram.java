package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Valid_Anagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String t= sc.next();
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t)
    {
        char[] str1=s.toCharArray();
        char [] str2=t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return toString(str1).equals(toString(str2));
    }
    public static String toString(char[] arr)
    {
        String str=new String(arr);
        return str;
    }
}
