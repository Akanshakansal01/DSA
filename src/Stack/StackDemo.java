package Stack;
//  Stack -->  LIFO (last in first out) or FILO (first in last out)
public class StackDemo {
    private int arr[];
    private int top;

    public StackDemo() {
        arr = new int[5];
        top = -1;
    }

    public StackDemo(int n) {
        arr = new int[n];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isfull() {
        return top == arr.length - 1;
    }

    public void push(int item) throws Exception {
        if (isfull()) {
            throw new Exception("Stack is full.");
        }
        top++;
        arr[top] = item;
    }

    public int pop() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("Stack is empty.");
        }
        int val = arr[top];
        top--;
        return val;
    }
    public int peek() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("Stack is empty.");
        }
        int val = arr[top];
        return val;
    }
    public int size()
    {
        return top + 1;
    }
    public void display() {

        for (int i = 0; i <= top; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
