package Linked_List;

import java.util.LinkedList;

public class Linked_List_Client {
    public static void main(String[] args) throws Exception {
        Linked_List ll=new Linked_List();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.display();
        ll.addLast(40);
        ll.display();
        ll.addAtIndex(3,80);
        ll.display();
        System.out.println(ll.GetFirst());
        System.out.println(ll.GetLAst());
        System.out.println(ll.Getatindex(2));
        System.out.println(ll.removefirst());
        ll.display();
        System.out.println(ll.removelast());
        ll.display();
        System.out.println(ll.removeatindex(2));
        ll.display();
    }
}
