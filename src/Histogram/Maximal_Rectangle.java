package Histogram;
// leectcode 85. Maximal Rectangle

import java.util.Stack;

public class Maximal_Rectangle{
        public static void main(String[] args) {
                int[][] matrix = { { 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0 } };
                int[] ans = new int[matrix.length];
                int area=0;
                for(int i=0;i< matrix.length;i++)
                {
                        for(int j=0;j<matrix[0].length;j++)
                        {
                                if(matrix[i][j]==1)
                                {
                                        ans[j]++;
                                }
                                else
                                {
                                        ans[j]=0;
                                }
                        }
                        area=Math.max(area,Area(ans));
                }
        }
        public static int Area(int[] arr)
        {
                int maxArea = 0;
                Stack<Integer> st = new Stack<>();
                for (int i = 0; i < arr.length; i++) {
                        while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                                int r = i;
                                int h = arr[st.pop()];
                                if (st.isEmpty()) {
                                        maxArea = Math.max(maxArea, (r * h));
                                } else {
                                        int l = st.peek();
                                        maxArea = Math.max(maxArea, ((r - l - 1) * h));
                                }
                        }
                        st.push(i);
                }
                int r = arr.length;
                while (!st.isEmpty())
                {
                        int h = arr[st.pop()];
                        if (st.isEmpty())
                        {
                                maxArea = Math.max(maxArea, (r * h));
                        } else
                        {
                                int l = st.peek();
                                maxArea = Math.max(maxArea, ((r - l - 1) * h));
                        }
                }
                return maxArea;
        }
}
