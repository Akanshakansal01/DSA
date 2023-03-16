package Graph;

import java.util.*;

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

    public void printallpath(int src, int des, HashSet<Integer> visited, String ans) {
        if (src == des) {
            System.out.println(ans+src);
            return;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                printallpath(nbrs, des, visited, ans + src + "----");
            }
        }
        visited.remove(src);
    }

    public boolean BFS(int src,int des)
    {
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q= new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()) {
//           step 1:  remove
            int rv=q.poll();
//           step 2: if already visited then ignore karo
            if(visited.contains(rv)){
                continue;
            }
//          step 3: visited
            visited.add(rv);
//            step 4: self work
            if(rv==des){
                return true;
            }
//            step 5: add neighbour(nbrs)
            for(int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }

    public boolean DFS(int src,int des)
    {
        HashSet<Integer> visited=new HashSet<>();
        Stack<Integer> st= new Stack<>();
        st.push(src);
        while(!st.isEmpty()) {
//           step 1:  remove
            int rv=st.pop();
//           step 2: if already visited then ignore karo
            if(visited.contains(rv)){
                continue;
            }
//          step 3: visited
            visited.add(rv);
//            step 4: self work
            if(rv==des){
                return true;
            }
//            step 5: add neighbour(nbrs)
            for(int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    st.push(nbrs);
                }
            }
        }
        return false;
    }

    public void BFT() {
        LinkedList<Integer> qq = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {  // 1 2 3 4 5 6 7
            if (visited.contains(src)) {
                continue;
            }
            qq.add(src);
            while (!qq.isEmpty()) {
                // remove
                int rv = qq.remove();
                // Ignore if Already Visited
                if (visited.contains(rv)) {
                    continue;
                }
                // visited mark
                visited.add(rv);
                // work
                System.out.print(rv + " ");
                // nbrs add krna
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        qq.add(nbrs);
                    }
                }
            }
        }
    }

    public void DFT() {
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            st.push(src);
            while (!st.isEmpty()) {
                // remove
                int rv = st.pop();
                // Ignore if Already Visited
                if (visited.contains(rv)) {
                    continue;
                }
                // visited mark
                visited.add(rv);
                // work
                System.out.print(rv + " ");
                // nbrs add krna
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        st.push(nbrs);
                    }
                }
            }
        }
    }
}
