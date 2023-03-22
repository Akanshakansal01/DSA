package Graph;

import java.util.*;

public class Graph_Bipartite {
    public class BipartitePair {
        int vtx;
        int lv; // level vertex
        public BipartitePair(int vt, int lv) {
            this.lv = lv;
            this.vtx = vt;
        }
    }
    class Solution {
        public boolean isBipartite(int[][] graph) {
            Map<Integer,Integer> visited=new HashMap<>();
            Queue<BipartitePair> q= new LinkedList<>();
            for (int src = 0; src < graph.length; src++) {
                if (visited.containsKey(src)) {
                    continue;
                }
                q.add(new BipartitePair(src, 0));
                while (!q.isEmpty()) {
//           step 1:  remove
                    BipartitePair rv = q.poll();
//           step 2: if already visited then ignore karo
                    if (visited.containsKey(rv.vtx)) {
                        if (visited.get(rv.vtx) != rv.lv)
                            return false;
                        else
                            continue;
                    }
//          step 3: visited
                    visited.put(rv.vtx, rv.lv);
//            step 5: add neighbour(nbrs)
                    for (int nbrs : graph[rv.vtx]) {
                        if (!visited.containsKey(nbrs)) {
                            q.add(new BipartitePair(nbrs, rv.lv + 1));
                        }
                    }
                }
            }
            return true;
        }

    }
}
