package Polimorphism;

interface calc {  // all the methods of interface class in public and abstract
	
	void add(int a, int b);   // Ex : public abstract void add(int a, int b); 
	
	public abstract int mult(int a, int b);
}

class MyCal implements calc{

	@Override
	public void add(int a, int b) {
		
		
	}

	@Override
	public int mult(int a, int b) {
		
		return a*b;
	}
	
}

public class InterfaceKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
