package Stack;

import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        int arr[]={10,2,1,3,5,4,8,7};
        nextGreaterElement(arr);
    }
    public static void nextGreaterElement(int []arr)
    {
        int res[]=new int[arr.length];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i< arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()])
            {
                res[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            res[st.pop()] = -1;
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]+"  -->  "+res[i]);
        }
    }
}

// time complexity : O(n)