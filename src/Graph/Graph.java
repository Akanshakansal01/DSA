package Graph;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    private HashMap<Integer,HashMap<Integer,Integer>> map= new HashMap<>();
    public Graph(int v)
    {
        for(int i=1;i<=v;i++)
        {
            map.put(i,new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost)
    {
        map.get(v1).put(v2, cost);   // v1--> map get kra then put v2 and Cost  //  v1 --> v2
        map.get(v2).put(v1, cost);  //  v2 --> v1
    }

    public boolean ContainsEdge(int v1, int v2)
    {
        return map.get(v1).containsKey(v2);
    }

    public boolean Containsvertex(int v1)
    {
        return map.containsKey(v1);
    }

    public int noofEdge() {
        int sum = 0;
        for (int key : map.keySet()) {
            sum = sum + map.get(key).size();
        }
        return sum / 2;
    }

    public void removeEdge(int v1, int v2) {
//        if (ContainsEdge(v1, v2)) {
            map.get(v1).remove(v2);  // v1 --> v2
            map.get(v2).remove(v1);  // v2 --> v1
//        }
    }

    public void removevertex(int v1) {
        for (int key : map.get(v1).keySet()) {
            map.get(key).remove(v1);
        }
        map.remove(v1);
    }
    public void display()
    {
        for(int key: map.keySet()){
            System.out.println(key+"-> "+map.get(key));
        }
    }
    public boolean hashpath(int src, int des, HashSet<Integer> visited) {
        if (src == des) {
            return true;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = hashpath(nbrs, des, visited);
                if (ans) {
                    return ans;
                }
            }
        }
        visited.remove(src);
        return false;
    }

}
