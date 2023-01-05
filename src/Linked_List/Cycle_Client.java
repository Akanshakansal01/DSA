package Linked_List;

public class Cycle_Client {
	public static void main(String[] args) throws Exception{
		Cycle_Create rc= new Cycle_Create();
		rc.addlast(1);
		rc.addlast(2);
		rc.addlast(3);
		rc.addlast(4);
		rc.addlast(5);
		rc.addlast(6);
		rc.addlast(7);
		rc.addlast(8);
		rc.Display();
		rc.createCycle();
//		rc.Display();
		rc.CycleRemoval1();
		rc.Display();
		rc.CycleRemoval2();
		rc.Display();
	}

}
