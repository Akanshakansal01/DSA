package Stack;

public class Stack_Client {
    public static void main(String[] args) throws Exception{
        StackDemo s=new StackDemo();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
//        s.push(60);
        System.out.println(s.peek());
        s.display();
        System.out.println(s.pop());
        s.display();
        System.out.println(s.size());
        s.push(-9);
        s.display();
        s.push(11);
        s.display();
    }
}
