//package Stack;
//
//import java.util.Stack;
//
//public class Pattern_132 {
//    public static void main(String[] args) {
//        int arr[]= {5,3,-4,0,1,2,6};
//        System.out.println(find132pattern(arr));
//    }
//    public static boolean find132pattern(int[] arr)
//    {
//        int min[]=new int[arr.length];
//        min[0]=arr[0];
//        for(int i=1;i<min.length;i++)
//        {
//            min[i]=Math.min(min[i-1],arr[i]);
//        }
//        Stack<Integer> st= new Stack<>();
//        for(int j= arr.length-1;j>=0;j++)
//        {
//            int ith=min[j];
//            while(!st.isEmpty() && ith>=arr[st.peek()])'
//            {
//                st.pop();
//            }
//            if(!st.isEmpty() && arr[j]>arr[st.peek()])
//                return true;
//            st.push(j);
//        }
//        return false;
//    }
//}
