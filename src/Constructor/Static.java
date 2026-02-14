package Constructor;

class demo {

	static int a, b; // 1

	int x, y;

	static { // 2
		System.out.println("Static Initialization Block");
	}

	{ // 3
		System.out.println("Java Initialization Block"); // Normal Java Block
	}

	demo() { // 4
		System.out.println("Constructor");
	}

	static void disp() {
		System.out.println("Display Static Method");
	}

	void show() {
		System.out.println("Non Static Show Method");
	}

}

public class Static {

	static {
		System.out.println("This will Execute before main method"); // Static Var and Static Block Will Execute fefore
																	// main
	}

	public static void main(String[] args) {
		System.out.println("This will execute after static method");

		demo d = new demo(); // before constructor normal java block will be execute
	}

}


