package LooseCoupling;

class A { 

	void display() {
		System.out.println("telusko.com");
	}

}

class B {

	void show() {

		A a = new A();
		a.display();
	}
}

public class LooseCoupling1 {

	public static void main(String[] args) {

	}

}
