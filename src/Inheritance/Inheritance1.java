package Inheritance;


class alpha{
	
	int age;
	
	void disp() {
		System.out.println("Alpha Class");
	}
	
}

class Beta extends alpha{
	
	void show() {
		System.out.println("Alpha Class");
	}
}

public class Inheritance1 {
	
	public static void main(String [] args) {

	Beta beta = new Beta();
	
	beta.disp();
	
	}
}
