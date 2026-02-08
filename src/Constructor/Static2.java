package Constructor;

import java.util.Scanner;

class LoanApp {

	private int amt;
	private int tenure;
	private int si;

	private static int roi = 7;

//	static {
//		roi = 7;
//	}

	void input() {

		System.out.println("Fill the form ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Loan Ammount ");
		amt = scan.nextInt();
		System.out.println("Enter the Loan Tenure ");
		tenure = scan.nextInt();
	}

	void calc() {
		si = (amt * roi * tenure) / 100;
	}

	void display() {
		System.out.println("SI is : " + si);
	}

}

public class Static2 {

	public static void main(String[] arga) {
		
		LoanApp lp = new LoanApp();
		
		lp.input();
		lp.calc();
		lp.display();
		

	}

}
