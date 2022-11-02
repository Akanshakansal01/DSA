import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Combination_SumII {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={10,1,2,7,6,1,5};
        int target=8;
        Arrays.sort(arr);
        combination(arr,target,"",0);
    }
    public static void combination(int[] arr,int target,String ans,int idx)
    {
        if(target==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<arr.length;i++)
        {
            if(i!=idx && arr[i]==arr[i-1])
                continue;
            if(target>=arr[i])
            {
               combination(arr,target-arr[i],ans+arr[i]+" ",i+1);
            }
        }
    }
}
