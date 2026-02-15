package Polimorphism;

//final class Telusko{ // Final can cannot ask in inheritance 
class Telusko {
	// final void course () { // cannot override from method which have final
	// keyword
//	Final Keyword Participate in inheritance but override is not allowed
	
	// Final int a = 10; Final Variable cannot be change in whole project.
	void course() {
		System.out.println("Telusko has both live and recorded");
	}
}

class TeluskoTux extends Telusko {
	void course() {
		System.out.println("Telusko has both live and recorded");
	}
}

public class FinalKeyword {

	public static void main(String[] args) {

		TeluskoTux t = new TeluskoTux();

		t.course();

	}

}
