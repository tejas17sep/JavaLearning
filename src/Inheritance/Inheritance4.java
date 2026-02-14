package Inheritance;

class Telusko {
	
	int age =4;

	void display() {
		//age = 4;
		System.out.println(age);
	}

}

class Alean extends Telusko {
	
		int age = 10;

	void display() {
		// age=5;
		System.out.println(super.age); // Super is use to call the value of age of parent class
	}
}

public class Inheritance4 {

	public static void main(String[] args) {

		Telusko t = new Alean();
		t.display();

	}

}
