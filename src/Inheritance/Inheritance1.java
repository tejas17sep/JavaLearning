package Inheritance;


class alpha{   //extends Object which created by java developer 
	
	int age;
	private String name="Tejas"; 
	void disp() {
		System.out.println("Alpha Class");
		System.out.println(name);
	}
	
}

class Beta extends alpha{
	
	void show() {
		System.out.println("Beta Class");
		System.out.println(age);
	//	System.out.println(name);// private dosnot participate in extends
		
	}
	
	
}

public class Inheritance1 {
	
	public static void main(String [] args) {

	Beta beta = new Beta();
	
	beta.disp();
	beta.show();
	beta.getClass();
	
	}
}
