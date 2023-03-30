/*   codeforces https://codeforces.com/problemset/problem/1242/B
                                                            B. 0-1 MST
Ujan has a lot of useless stuff in his drawers, a considerable part of which are his math notebooks: it is time to sort them out. This time
he found an old dusty graph theory notebook with a description of a graph.
It is an undirected weighted graph on nvertices. It is a complete graph: each pair of vertices is connected by an edge.
The weight of each edge is either 0or 1;exactly m edges have weight 1, and all others have weight 0.
Since Ujan doesn't really want to organize his notes, he decided to find the weight of the minimum spanning tree of the graph.
(The weight of a spanning tree is the sum of all its edges.) Can you find the answer for Ujan so he stops procrastinating?
Input
    The first line of the input contains two integers n and m(1≤n≤105 , 0≤m≤min(n(n−1)2,105)), the number of vertices and the number of edges
    of weight 1 in the graph.
    The i-th of the next m lines contains two integers ai and bi (1≤ai,bi≤n , ai≠bi), the endpoints of the i-th edge of weight 1.
    It is guaranteed that no edge appears twice in the input.
Output
    Output a single integer, the weight of the minimum spanning tree of the graph.\
INPUT                                              OUTPUT
        6 11                                              2
        1 3
        1 4
        1 5
        1 6
        2 3
        2 4
        2 5
        2 6
        3 4
        3 5
        3 6
 */

package Graph2;

import java.util.*;

public class MST_0_1_IstApproach {
    private HashMap<Integer, List<Integer>> map = new HashMap<>();

    public MST_0_1_IstApproach(int v) {
        for (int i = 1; i <= v; i++) {
            map.put(i, new ArrayList<>());
        }
    }

    public void AddEdge(int v1, int v2) {
        map.get(v1).add(v2);// v1--> v2
        map.get(v2).add(v1);// v2--> v1
    }

    public class PrimsPair{
        int vtx;
        int acqvtx;
        int cost;
        public PrimsPair(int vtx,int acqvtx,int cost){
            this.vtx=vtx;
            this.acqvtx=acqvtx;
            this.cost=cost;
        }
        public String toString(){
            return this.vtx+" "+this.acqvtx+" @ "+this.cost;
        }
    }
    public int PrimsAlgo(){
        PriorityQueue<PrimsPair> pq= new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.cost-o2.cost;
            }
        });
        pq.add(new PrimsPair(1,1,0));  //
        HashSet<Integer> visited= new HashSet<>();
        int sum=0;
        while(!pq.isEmpty()){
            PrimsPair rp= pq.poll();                       // remove
            if(visited.contains(rp.vtx)){                  // ignore
                continue;
            }
            sum += rp.cost;
            visited.add(rp.vtx);                           // visited
//            System.out.println(rp);                        // self work
            for(int nbrs=1;nbrs<=map.size();nbrs++){        // neighbours
                if(!visited.contains(nbrs)){
                    int cost=0;
                    if(map.get(rp.vtx).contains(nbrs)){
                        cost=1;
                    }
                    PrimsPair np= new PrimsPair(nbrs,rp.vtx,cost);
                    pq.add(np);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        MST_0_1_IstApproach mst= new MST_0_1_IstApproach(n);
        for(int i=0;i<m;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            mst.AddEdge(v1,v2);
        }
        System.out.println(mst.PrimsAlgo());
    }
}
