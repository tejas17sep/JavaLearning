package Inheritance;

class parent {

	void age() {
		System.out.println("Age of parent is 50");
	}

}

class child extends parent {

	void age() {
		System.out.println("Age of child is 25"); // if we override we will get child element output.
	}
	
	void display() {
		
		System.out.println("To check Downcasting");
	}

}

public class Inheritance2 {

	public static void main(String[] args) {

		// child c = new child();

		parent c = new child(); // Polymorphism

		c.age();

		((child) c).age();  //Downcasting
		
		((child)c).display();

	}

}
