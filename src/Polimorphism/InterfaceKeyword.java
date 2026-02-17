package Polimorphism;

interface calc { // all the methods of interface class in public and abstract

	void add(int a, int b); // Ex : public abstract void add(int a, int b);

	public abstract int mult(int a, int b);
}

class MyCal implements calc {

	@Override
	public void add(int a, int b) {

		int c = a + b;
		System.out.println("Add result is " + c);

	}

	@Override
	public int mult(int a, int b) {

		return a * b;
	}

}

class MyCal2 implements calc {

	@Override
	public void add(int a, int b) {

		int c = a + b + 100;
		System.out.println("Add result is " + c);

	}

	@Override
	public int mult(int a, int b) {

		return a * b;
	}

}

public class InterfaceKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
