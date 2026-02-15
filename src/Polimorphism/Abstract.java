package Polimorphism;

abstract class AeroPlane1 {

	public abstract void takeOff(); // if the object or method is empty it schould contain abstract and in class
	public abstract void fly(); 	// abstract word schould be there
									// and we cannot create object of abstract class ex AeroPlane1 a = new
									// AeroPlane1();
	
	public void landing() {
		System.out.println("Abstract class can have method without abstract");
	}

}

class FighterPlane1 extends AeroPlane {
	public void takeOff() {
		System.out.println(" Fighter Plane is Takeing Off");
	}

	public void fly() {
		System.out.println("Fighter Plane is Flying");
	}
}

class CargoPlane1 extends AeroPlane {
	public void takeOff() {
		System.out.println("Cargo Plane is Takeing Off");
	}

	public void fly() {
		System.out.println("Cargo Plane is Flying");
	}

}

class CommPlane1 extends AeroPlane {
	public void takeOff() {
		System.out.println("Commercial Plane is Takeing Off");
	}

	public void fly() {
		System.out.println("Commercial Plane is Flying");
	}

}

class Airport1 {

	public void permit(AeroPlane aero) {

		aero.takeOff();
		aero.fly();

	}

}

public class Abstract {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		CommPlane cpp = new CommPlane();

		Airport a = new Airport();

		a.permit(cp);
		a.permit(fp);
		a.permit(cpp);
	}

}
