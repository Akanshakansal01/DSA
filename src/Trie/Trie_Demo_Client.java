package Trie;

public class Trie_Demo_Client {
    public static void main(String[] args) {
        Trie_Demo t= new Trie_Demo();
        t.insert("raj");
        t.insert("raja");
        t.insert("apple");
        t.insert("mango");
        t.insert("man");
        t.insert("ankit");
        t.insert("ankita");
        t.insert("amisha");
        t.startsWith("app");
        t.search("rajesh");
    }
}
