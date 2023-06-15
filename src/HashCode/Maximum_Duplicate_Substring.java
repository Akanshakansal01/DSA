// leetcode 1044. Longest Duplicate Substring
package HashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Maximum_Duplicate_Substring {
//    public static void main(String[] args) {
//        String s="banana";
//        int lo=0;
//        int hi=s.length();
//        String ans="";
//        while(lo<=hi){
//            int mid = (lo+hi)/2;
//            String res=Solve(s,mid);
//            if(res.length()>0){
//                lo=mid+1;
//            }
//            else {
//                hi = mid - 1;
//            }
//        }
//        System.out.println(ans);
//    }
//    public static String Solve(String s,int mid){
//        long mod=1000_000_007;
//        long pow=1;
//        long hv=0;
//        int pr=31;
//        for(int ei=mid-1;ei>=0;ei--){
//            hv=(hv+(((s.charAt(ei)-'a'+1)*pow ) % mod) % mod;
//            if(ei>0){
//                pow=(pow*pr) % mod;
//            }
//        }
//        HashMap<Long, List<Integer>> map = new HashMap<>();
//        map.put(hv,new ArrayList<>());
//        map.get(hv).add(0);
//        for(int ei=mid,si=0;ei<s.length();ei++,si++){
//            hv=(hv-((s.charAt(si)-'a'+1)*pow ) % mod) % mod;
//            hv=(hv*pr)%mod;
//            hv=(hv+(s.charAt(ei)-'a'+1)) % mod;
//            if(map.containsKey(hv)){
//                String curr=s.substring(si+1,ei+1);
//
//                return curr;
//            }
//            else{
//                map.put(hv,new ArrayList<>());
//                map.get(hv).add(si+1);
//            }
//        }
//        return "";
//    }
}
