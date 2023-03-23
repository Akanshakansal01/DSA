package Graph1;

import java .util.*;

public class Topological_Sort {
    private HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();

    public Topological_Sort(int v) {
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);// v1--> v2
//        map.get(v2).put(v1, cost);// v2--> v1
    }

    public void TopologicalSort() {
        Queue<Integer> qq = new LinkedList<>();
        int[] ind = indgree();
        for (int i = 1; i < ind.length; i++) {
            if (ind[i] == 0) {
                qq.add(i);
            }
        }
        while (!qq.isEmpty()) {
            int rv = qq.remove();
            System.out.print(rv + " ");
            for (int nbrs : map.get(rv).keySet()) {
                ind[nbrs]--;
                if (ind[nbrs] == 0) {
                    qq.add(nbrs);
                }
            }
        }
    }

    public int[] indgree() {
        int[] arr = new int[map.size() + 1];
        for (int key : map.keySet()) {

            for (int nbrs : map.get(key).keySet()) {
                arr[nbrs]++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Topological_Sort ts = new Topological_Sort(8);
        ts.AddEdge(1, 2,0);
        ts.AddEdge(2, 4,0);
        ts.AddEdge(3,1,0);
        ts.AddEdge(3, 2,0);
        ts.AddEdge(4, 5,0);
        ts.AddEdge(4,6,0);
        ts.AddEdge(5,6,0);
        ts.AddEdge(7,8,0);
        System.out.println(Arrays.toString(ts.indgree()));
        ts.TopologicalSort();
//        System.out.println(ts.iscycle());
    }
}
