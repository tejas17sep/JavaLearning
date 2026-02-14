package Inheritance;


class alpha{
	
	int age;
	
	void disp() {
		System.out.println("Alpha Class");
	}
	
}

class Beta extends alpha{
	
	void show() {
		System.out.println("Beta Class");
		System.out.println(age);
	}
	
	
}

public class Inheritance1 {
	
	public static void main(String [] args) {

	Beta beta = new Beta();
	
	beta.disp();
	beta.show();
	
	}
}
