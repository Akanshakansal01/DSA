package Linked_List;

import java.util.LinkedList;

public class Linked_List {
    private class Node
    {
        int val;   // data
        Node next;  // store address of next node
    }
    private Node head;// 1st node address yaad krega every LinkedList
    private Node tail;// last node address yaad krega every LinkedList
    private int size;// total number of Node in LinkedList
//O(1)
    public void addFirst(int item)
    {
        Node nn= new Node();  // create a new node in heap memory in which val=0 and address=-null
        nn.val=item;
        if(this.size==0)
        {
            head=nn;
            tail=nn;
            size++;
        }
        else
        {
            nn.next=head;
            head=nn;
            size++;
        }
    }

//    O(1)
    public void addLast(int item) {
        if (size == 0)
        {
            addFirst(item);
        }
        else
        {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

//    O(1)
    public Node GetNode(int k) throws Exception {

        if (k < 0 || k >= size)
        {
            throw new Exception("Index InValid, out of range.");
        }
        Node temp = head;
        for (int i = 1; i <= k; i++)
        {
            temp = temp.next;
        }
        return temp;
    }

//    O(N)
    public void addAtIndex(int k, int item) throws Exception {
        if(k<0 || k>size)
        {
            throw new Exception("k is out of range.");
        }
        if (k == 0)
        {
            addFirst(item);
        }
        else if (k == size - 1)
        {
            addLast(item);
        }
        else
        {
            Node k_1th = GetNode(k - 1);
            Node nn = new Node();
            nn.val = item;
            nn.next = k_1th.next;
            k_1th.next = nn;
            size++;
        }
    }

    //O(1)
    public int GetFirst() throws Exception {
        if (size == 0) {
            throw new Exception("BkLol is Linked empty hai");
        }
        return head.val;
    }
    // O(1)
    public int GetLAst() throws Exception {
        if (size == 0) {

            throw new Exception("BkLol is Linked empty hai");
        }
        return tail.val;
    }
    // O(N)
    public int Getatindex(int k) throws Exception {

        return GetNode(k).val;
    }

    //O(1)
    public int removefirst() throws Exception {
        if (size == 0)
        {
            throw new Exception("Linked empty hai.");
        }
        Node temp = head;
        if (size == 1)
        {
            head=null;
            tail = null;
            size--;
        }
        else
        {
            head = head.next;
            temp.next = null;
            size--;
        }
        return temp.val;
    }

//    O(N)
    public int removelast() throws Exception {
        if (size == 0)
        {
            throw new Exception("Linked empty hai.");
        }
        if (size == 1)
        {
            return removefirst();
        }
        else
        {
            Node n = GetNode(size - 2);
//            Node temp = tail;
            int rv= tail.val;
            tail = n;
            tail.next = null;
            size--;
            return rv;
        }
    }

    //O(N)
    public int removeatindex(int k) throws Exception {

        if (k == 0) {
            return removefirst();
        } else if (k == size - 1) {
            return removelast();
        } else {
            Node curr = GetNode(k);
            Node prev = GetNode(k - 1);
            prev.next = curr.next;
            curr.next = null;
            size--;
            return curr.val;
        }

    }

    public void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL.");
    }
}
