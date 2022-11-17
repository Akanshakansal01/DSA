package Inheritance;

public class Client {
    public static void main(String[] args) {
        // Case 1
//		P obj = new P();     // obj is reference variable while RHS side is instance variable.
//		System.out.println(obj.d);   //  1
//		System.out.println(obj.d1);   // 10
//		obj.fun();  // Fun in P
//		obj.fun1();  // fun1 in P


		// Case 2
//		P obj = new C();
//		System.out.println(obj.d);   //  1
//		System.out.println(obj.d1);  // 10
//		System.out.println(((C) (obj)).d);  // 1
//		System.out.println(((C) (obj)).d2);  // 20
//		// System.out.println(obj.d2);
//		obj.fun();  // Fun in C  //  compile time P class fun() is execute while at compile time C class fun() is executed.
//		obj.fun1();   //  Fun1 in P
//		((C) (obj)).fun2();  //  Fun2 in C


		// Case 3     ---> not allowable
//		C obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);


		// Case 4
		C obj = new C();
		System.out.println(obj.d);   // 1
		System.out.println(obj.d1);   // 10
		System.out.println(obj.d2);   // 20
		System.out.println(((P) (obj)).d);  // 1
		obj.fun(); // Fun in C
		obj.fun1(); // Fun in P
		obj.fun2();  // Fun in C


	}
}
