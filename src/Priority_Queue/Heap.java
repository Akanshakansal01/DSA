package Priority_Queue;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> list= new ArrayList<>();
    public void add(int item){
        list.add(item);
        upheapify(list.size()-1);

    }

    private void upheapify(int ci)
    {
        int pi=(ci-1)/2;
        if(list.get(pi)>list.get(ci))
        {
            Swap(pi,ci);
            upheapify(pi);
        }
    }
    public void Swap(int i,int j)
    {
        int ith= list.get(i);
        int jth= list.get(j);
        list.set(i,jth);
        list.set(j,ith);
    }
    public int max()
    {
        Swap(0,list.size()-1);
        int rv=list.remove(list.size()-1);
        downhaepify(0);
        return rv;
    }

    private void downhaepify(int pi) {
        int lci=2*pi+1;
        int rci=2*pi+2;
        int minIndex=pi;
        if(lci<list.size() && list.get(minIndex)>list.get(lci))
        {
            minIndex=lci;
        }
        if(rci <list.size() && list.get(minIndex)>list.get(rci))
        {
            minIndex=rci;
        }
        if(minIndex!=pi)
        {
            Swap(minIndex,pi);
            downhaepify(minIndex);
        }
    }
    public int min()
    {
        return list.get(0);
    }
    public int size()
    {
        return list.size();
    }
    public void display()
    {
        System.out.println(list);
    }
}
