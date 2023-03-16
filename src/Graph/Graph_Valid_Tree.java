package Graph;

import java.util.*;

public class Graph_Valid_Tree {
    public class Solution {
        public boolean validTree(int n, int[][] edges) {
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(i,new ArrayList<>());
            }
            for (int i = 0; i < edges.length; i++) {
                int v1 = edges[i][0];
                int v2 = edges[i][1];
                map.get(v1).add(v2, 1);// v1--> map get kra then put v2 and Cost //  v1 --> v2
                map.get(v2).add(v1, 1); // v2 -- > v1
            }
            return isValid(map);
        }
        public boolean isValid(HashMap<Integer, List<Integer>> map){
            Stack<Integer> st = new Stack<>();
            HashSet<Integer> visited = new HashSet<>();
            int count=0;
            for (int src : map.keySet()) {
                if (visited.contains(src)) {
                    continue;
                }
                count++;
                st.push(src);
                while (!st.isEmpty()) {
                    // remove
                    int rv = st.pop();
                    // Ignore if Already Visited
                    if (visited.contains(rv)) {
                        return false;
                    }
                    // visited mark
                    visited.add(rv);
                    // work
                    System.out.print(rv + " ");
                    // nbrs add krna
                    for (int nbrs : map.get(rv)) {
                        if (!visited.contains(nbrs)) {
                            st.push(nbrs);
                        }
                    }
                }
            }
            return count==1;
        }
    }
}
