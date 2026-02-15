package Polimorphism;

class AeroPlane {

	public void takeOff() {
		System.out.println("Plane is Takeing Off");
	}

	public void fly() {
		System.out.println("Plane is Flying");
	}

}

class FighterPlane extends AeroPlane {
	public void takeOff() {
		System.out.println(" Fighter Plane is Takeing Off");
	}

	public void fly() {
		System.out.println("Fighter Plane is Flying");
	}
}

class CargoPlane extends AeroPlane {
	public void takeOff() {
		System.out.println("Cargo Plane is Takeing Off");
	}

	public void fly() {
		System.out.println("Cargo Plane is Flying");
	}

}

class CommPlane extends AeroPlane {
	public void takeOff() {
		System.out.println("Commercial Plane is Takeing Off");
	}

	public void fly() {
		System.out.println("Commercial Plane is Flying");
	}

}

class Airport {

	public void permit(AeroPlane aero) {

		aero.takeOff();
		aero.fly();

	}

}

public class Poli1 {

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
