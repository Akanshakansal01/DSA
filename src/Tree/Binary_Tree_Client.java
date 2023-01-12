package Tree;

public class Binary_Tree_Client {
    public static void main(String[] args) {
        Binary_Tree bt= new Binary_Tree();
        bt.Display();
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
//        20<--10-->30
//        40<--20-->50
//        .<--40-->.
//        .<--50-->.
//        .<--30-->60
//         70<--60-->.
//         .<--70-->.
        bt.PreOrder();   //  10 20 40 50 30 60 70
        bt.PostOrder();  //  40 50 20 70 60 30 10
        bt.InOrder();   //   40 20 50 10 30 70 60
        System.out.println(bt.Search(60));  // true
        System.out.println(bt.Search(-60));  // false
        System.out.println(bt.Max());   // 70
        System.out.println(bt.height());  // 3
    }
}
