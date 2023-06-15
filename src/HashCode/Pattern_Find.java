/*  NAJPF - Pattern Find    link :- https://www.spoj.com/problems/NAJPF/
Your task is so simple given a string and a pattern. You find the pattern on the given string. If found print how many time found the pattern
and their index. Otherwise print ‘Not Found’

Input:
    The input   line consists of a number T (1 ≤ T ≤ 50) test cases.
    For each case given two string number  A,B. the string and the pattern  1 ≤|A|, |B| ≤10^6
    All character will be lower case Latin character.  And |  | is the length of string.

Output:
    For each case print the number  (found pattern from the given string) next line there position And Otherwise print 'Not Found'
    without quota.
    There will a blank line between two cases.

Sample:
    Input                                                            Output
    3                                                                3
    ababab ab                                                        1 3 5
    aaaaa bbb                                                        not found
    aafafaasf aaf                                                     1
                                                                      1

 */
package HashCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pattern_Find {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            String s=sc.next();
            String t= sc.next();
            RabinKarp(s,t);
        }
    }
    public static void RabinKarp(String s,String t){
        long mod=1000_000_007;
        int pr=31;
        long ans=0; // contains hashvalue means hv
        long pow=1;
        for (int i = 0; i < t.length(); i++){
            char ch=t.charAt(i);
            ans=(ans+((ch-'a'+1)*pow) % mod) % mod;
            ans=(ans+mod)%mod;
            pow=(pow*pr)%mod;
        }

//        Rabin Karp
        long [] dp=new long[s.length()];
        long [] pa=new long[s.length()];
        dp[0]=s.charAt(0)-'a'+1;
        pa[0]=1;
        pow=pr;
        for(int i=1;i<pa.length;i++){
            char ch=s.charAt(i);
            dp[i]=(dp[i-1]+((ch-'a'+1)*pow%mod)%mod);
            pa[i]=pow;
            pow = (pow*pr)%mod;
        }
        ArrayList<Integer> ll= new ArrayList<>();
        if(dp[t.length()-1]==ans){
            ll.add(0);
        }
        for (int ei=t.length(),si=1;ei< pa.length;ei++,si++){
            long hvalue=dp[ei]-dp[si-1];
            if(hvalue==ans*pa[si]%mod){
                ll.add(si+1);
            }
        }
        if(ll.size()==0){
            System.out.println("Not Found");
        }
        else{
            System.out.println(ll.size());
            for(int val:ll){
                System.out.println(val+" ");
            }
        }
        System.out.println();
    }
}

