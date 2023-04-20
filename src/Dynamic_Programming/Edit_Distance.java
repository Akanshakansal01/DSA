package Dynamic_Programming;
// leetcode 72: Edit Distance
public class Edit_Distance {
    public static void main(String[] args) {
        String s1="FOOD";
        String s2="MONKEY";
        System.out.println(MinOps(s1,s2,0,0));
    }

    // using recursion
    public static int MinOps(String s1,String s2,int i,int j){
        // base case
        if(i==s1.length()){
            return s2.length()-j;
        }
        if(j==s2.length()){
            return s1.length()-i;
        }
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans = MinOps(s1,s2,i+1,j+1);
        }
        else{
            // insertion
            int I=MinOps(s1,s2,i,j+1);
            // deletion
            int D=MinOps(s1,s2,i+1,j);
            // Remove
            int R= MinOps(s1,s2,i+1,j+1);
            ans = Math.min(I,Math.min(D,R))+1;
        }
        return ans;
    }

}
