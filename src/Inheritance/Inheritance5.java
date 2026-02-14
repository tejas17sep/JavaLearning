package Inheritance;

class Telusko1 {
	
	int age =4;

	void display() {
		//age = 4;
		System.out.println(age);
	}

}

class Alean1 extends Telusko {
	
	int age = 10;

	void display() {
		// age=5;
		System.out.println(age); // Super is use to call the value of age of parent class
		//System.out.println(super.age); // Super is use to call the value of age of parent class
	}
	
	void show() {
		//super.display();
		this.display();
	}
}


public class Inheritance5 {

	public static void main(String[] args) {
		
		Telusko t = new Alean1();
		((Alean1)t).show();

	}

}
