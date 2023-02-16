package Priority_Queue;

public class Generic_Heap_Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Generic_heap<Cars> gp = new Generic_heap<>();
        gp.add(new Cars(200, 10, "White"));
        gp.add(new Cars(1000, 20, "Black"));
        gp.add(new Cars(345, 3, "Yellow"));
        gp.add(new Cars(34, 89, "Grey"));
        gp.add(new Cars(8907, 6, "Red"));
        gp.display();

    }
}
