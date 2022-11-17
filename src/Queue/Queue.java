package Queue;
// Queue --> FIFO (first in first out) or LILO (last in last out)
public class Queue {
    private int[] arr;
    private int front=0;  // from where element is extract
    private int size=0;
    public Queue()
    {
        arr = new int[5];
//        this.size = 0;
//        this.front = 0;
    }
    public Queue(int n)
    {
        arr = new int[n];
//        this.size = 0;
//        this.front = 0;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public boolean isfull()
    {
        return size == arr.length;
    }
    public int size()
    {
        return size;
    }
    public void Enqueue(int item) throws Exception
    {
        if (isfull() == true)
        {
            throw new Exception("Queue is full. ");
        }
        int idx= (front+size) % arr.length;
        arr[idx]=item;
        size++;
    }
    public int Dequeue() throws Exception
    {
        if (isEmpty() == true)
        {
            throw new Exception("Queue is empty.");
        }
        int rv=arr[front];
        front=(front+1)% arr.length;
        size--;
        return rv;
    }
    public int GetFront() throws Exception
    {
        if (isEmpty() == true)
        {
            throw new Exception("Queue is empty.");
        }
        int rv=arr[front];
        return rv;
    }
    public void Display() {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }
}
