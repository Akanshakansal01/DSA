package Queue;
// leetcode : 1063. Number of Valid Subarrays
// question link :     https://leetcode.ca/all/1063.html
/*
Given an array A of integers, return the number of non-empty continuous subarrays that satisfy the following condition:
The leftmost element of the subarray is not larger than other elements in the subarray.
    Example 1:
        Input: [1,4,2,5,3]
        Output: 11
        Explanation: There are 11 valid subarrays: [1],[4],[2],[5],[3],[1,4],[2,5],[1,4,2],[2,5,3],[1,4,2,5],[1,4,2,5,3].
 */

import java.util.Stack;

public class Number_of_Valid_Subarray {
    public static void main(String[] args) {
        int arr[]= {1,4,2,5,3};
        System.out.println(ValidSubarray(arr));
    }
    public static int ValidSubarray(int arr[])
    {
        Stack<Integer> st= new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
               while(!st.isEmpty() && arr[i]<st.peek())
               {
                   st.pop();
               }
               st.push(arr[i]);
               ans+=st.size();
        }
        return ans;
    }
}
