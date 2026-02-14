package Inheritance;

class Demo1 {

	Demo1() {

		// Super(); to call the constructor of parent class

		System.out.println("Demo1 Const");
	}
	
	Demo1(int x,int y) {

		System.out.println("Demo2 Const with param");
	}
}

class Demo2 extends Demo1 {
	
	int a,b;

	Demo2() {    //3

		// Super(); to call the constructor of parent class this should be in first line
		// only but in JAVA 25 we can write it any where

		System.out.println("Demo2 Const");
	}
	
	Demo2(int a,int b) {    //2
		
		this();   // in first line only and if this() and super() only one at a time;
		this.a=a;
		this.b=b;
		
		System.out.println("Demo2 Const with param");   //4
		System.out.println("a"+a+"b"+b);
	}
	
	void display() { //5
		System.out.println("a"+a+"b"+b);
	}
}

public class Inheritance3 {

	public static void main(String[] args) {

		Demo2 d = new Demo2(10,20);        //1
		d.display();
		

	}

}
