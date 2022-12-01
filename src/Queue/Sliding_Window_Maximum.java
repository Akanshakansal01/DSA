package Queue;

import java.util.Deque;
import java.util.LinkedList;

// leetcode :  239. Sliding Window Maximum
public class Sliding_Window_Maximum {
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;

    }
    public static int[] maxSlidingWindow(int []arr,int k)
    {
        Deque<Integer> dq=new LinkedList<Integer>();
        int [] ans= new int[arr.length-k+1];
        int j=1;
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty() && arr[i]>arr[dq.getLast()])
            {
                dq.removeLast(); // remove from last
            }
            dq.add(i); // add at last
        }
        ans[0]=arr[dq.getFirst()];
        for(int i=k;i< arr.length;i++)
        {
            while(!dq.isEmpty() && arr[i]>arr[dq.getLast()])
            {
                dq.removeLast(); // remove from last
            }
            dq.add(i);
            if(!dq.isEmpty() && dq.getFirst()==i-k)
            {
                dq.removeFirst(); // remove from starting
            }
            ans[j]=arr[dq.getFirst()];
            j++;
        }
        return ans;
    }
}
