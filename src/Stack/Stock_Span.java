package Stack;

import java.util.Stack;

public class Stock_Span {
    public static void main(String[] args) {
        int arr[]={10,2,1,3,5,4,7,8,19};
        CallSpan(arr);
    }
    public static void CallSpan(int []arr)
    {
        int res[]=new int[arr.length];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i< arr.length;i++) {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if(!st.isEmpty())
            {
                res[i]=i-st.peek();
            }
            else
            {
                res[i] = i+1;
            }
            st.push(i);
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]+"  -->  "+res[i]);
        }
    }
}
