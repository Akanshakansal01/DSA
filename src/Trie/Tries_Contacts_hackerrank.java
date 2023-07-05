package Trie;

import java.util.HashMap;

public class Tries_Contacts_hackerrank {
    public class  Node{
        char ch;
        HashMap<Character, Node> child= new HashMap<>();
        boolean isTerminal= false;
        int count=0;
    }
    private Node root;
    public Tries_Contacts_hackerrank(){
        Node nn = new Node();
        nn.ch='*';
        this.root=nn;
    }

    public void insert(String word) {
        Node curr = root;
        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
                curr.count++;
            }
            else{
                Node nn= new Node();
                nn.ch= ch;
                curr.child.put(ch,nn);
                nn.count=1;
                curr=nn;
            }
        }
        curr.isTerminal = true;
    }

    public boolean search(String word) {
        Node curr = root;
        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);
            if(!curr.child.containsKey(ch)){
                return false;
            }
            curr = curr.child.get(ch);
        }
        return curr.isTerminal;
    }

    public int startsWith(String prefix) {
        Node curr = root;
        for(int i=0;i<prefix.length();i++){
            char ch= prefix.charAt(i);
            if(!curr.child.containsKey(ch)){
                return 0;
            }
            curr = curr.child.get(ch);
        }
        return curr.count;
    }

    public static void main(String[] args) {
        Tries_Contacts_hackerrank t= new Tries_Contacts_hackerrank();
        t.insert("hack");
        t.insert("hackerrank");
        System.out.println(t.startsWith("hac"));
        System.out.println(t.startsWith("hak"));
    }
}
