package Stack;

import java.util.Stack;

public class Insert_Down_In_Stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Insert(st,-3);
        System.out.println(st);

    }
    public static void Insert(Stack<Integer> st,int i)
    {
//        base case
        if (st.isEmpty())
        {
            st.push(i);
            return;
        }
        int item = st.pop();
        Insert(st, i);
        st.push(item);
    }
}
