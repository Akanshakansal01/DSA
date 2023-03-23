package Graph1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort_Cycle {
    private HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
    public Topological_Sort_Cycle(int v) {
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);// v1--> v2
//        map.get(v2).put(v1, cost);// v2--> v1
    }
    public boolean TopologicalSort() {
        Queue<Integer> qq = new LinkedList<>();
        int[] ind = indgree();
        for (int i = 1; i < ind.length; i++) {
            if (ind[i] == 0) {
                qq.add(i);
            }
        }
        int count=0;
        while (!qq.isEmpty()) {
            int rv = qq.remove();
            count++;
            System.out.print(rv + " ");
            for (int nbrs : map.get(rv).keySet()) {
                ind[nbrs]--;
                if (ind[nbrs] == 0) {
                    qq.add(nbrs);
                }
            }
        }
        return count==map.size() ? false :true;
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
        Topological_Sort_Cycle ts = new Topological_Sort_Cycle(8);
        ts.AddEdge(1, 2,0);
        ts.AddEdge(2, 4,0);
        ts.AddEdge(1,3,0);
        ts.AddEdge(3, 2,0);
        ts.AddEdge(4, 5,0);
        ts.AddEdge(4,6,0);
        ts.AddEdge(5,6,0);
        ts.AddEdge(7,8,0);
        System.out.println(Arrays.toString(ts.indgree()));
        System.out.println(ts.TopologicalSort());
//        System.out.println(ts.iscycle());
    }
}
