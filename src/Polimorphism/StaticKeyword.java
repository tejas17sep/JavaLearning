package Polimorphism;

class animal {
	static int age;

	static void disp() {
		System.out.println("Parent Class Static Method");
	}
}

class deer extends animal{
	
//	static void disp() {
//		System.out.println("Parent Class Static Method");   // This thing gets execut when we take animal d =new deer();
//	}														// in static method is available in child class and dominet the clild classs object

	static void disp() {
		System.out.println("Deer Class Static Method");
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		
		animal d =new deer(); //if we use pa rent reference it will give us parent class output not overridden one 
		//deer d = new deer();// override will work properly, 
		d.disp();

	}

}
