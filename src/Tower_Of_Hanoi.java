import java.util.Scanner;

public class Tower_Of_Hanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String src="A";
        String hlp="B";
        String des="C";
        towerOfHanoi(n,src,hlp,des);
    }
    public static void towerOfHanoi(int n,String src,String hlp,String des)
    {
        if(n==0)
            return;
        towerOfHanoi(n-1,src,des,hlp);
        System.out.println("Move "+n+"th disc from "+src+"to "+des);
        towerOfHanoi(n-1,hlp,src,des);
    }
}
