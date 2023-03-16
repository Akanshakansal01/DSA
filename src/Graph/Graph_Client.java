package Graph;

import java.util.HashSet;

public class Graph_Client {
    public static void main(String[] args) {
        Graph g= new Graph(7);
        g.AddEdge(1, 4, 6);
        g.AddEdge(1, 2, 10);
        g.AddEdge(2, 3, 7);
        g.AddEdge(3, 4, 5);
        g.AddEdge(4, 5, 1);
        g.AddEdge(5, 6, 4);
        g.AddEdge(7, 5, 2);
        g.AddEdge(6, 7, 3);
//        g.display();
//        1-> {2=10, 4=6}
//        2-> {1=10, 3=7}
//        3-> {2=7, 4=5}
//        4-> {1=6, 3=5, 5=1}
//        5-> {4=1, 6=4, 7=2}
//        6-> {5=4, 7=3}
//        7-> {5=2, 6=3}
//        g.removevertex(4);
//        System.out.println();
//        g.display();
//        1-> {2=10}
//        2-> {1=10, 3=7}
//        3-> {2=7}
//        5-> {6=4, 7=2}
//        6-> {5=4, 7=3}
//        7-> {5=2, 6=3}
        System.out.println(g.hashpath(1, 6, new HashSet<>()));  // false
//        g.printallpath(1,  6, new HashSet<>(), "");
        System.out.println(g.BFS(1,6));
        System.out.println(g.DFS(1,6));
        g.DFT();
        System.out.println();
        g.BFT();
    }
}
