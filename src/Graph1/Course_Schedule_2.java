package Graph1;

import java.util.*;

public class Course_Schedule_2 {
    class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < numCourses; i++) {
                map.put(i, new ArrayList<>());
            }
            for (int i = 0; i < prerequisites.length; i++) {
                int v1 = prerequisites[i][0];
                int v2 = prerequisites[i][1];
                map.get(v2).add(v1);
            }
            return TopologicalSort(map);
        }
        public int[] TopologicalSort(HashMap<Integer, List<Integer>> map) {
            Queue<Integer> qq = new LinkedList<>();
            int[] ind = indgree(map);
            int course[]= new int[map.size()];
            int idx=0;
            for (int i = 0; i < ind.length; i++) {
                if (ind[i] == 0) {
                    qq.add(i);
                }
            }
            int count=0;
            while (!qq.isEmpty()) {
                int rv = qq.remove();
                course[idx++]=rv;
                count++;
//                System.out.print(rv + " ");
                for (int nbrs : map.get(rv)) {
                    ind[nbrs]--;
                    if (ind[nbrs] == 0) {
                        qq.add(nbrs);
                    }
                }
            }
            return count==map.size()? course: new int[0];
        }
        public int[] indgree(HashMap<Integer,List<Integer>> map) {
            int[] arr = new int[map.size()];
            for (int key : map.keySet()) {

                for (int nbrs : map.get(key)) {
                    arr[nbrs]++;
                }
            }
            return arr;
        }
    }
}
