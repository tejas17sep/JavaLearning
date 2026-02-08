package Encapsulation;

class Employe {

	private int ID;
	private String name;
	private int salery;

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalery() {
		return salery;
	}

	public void setSalery(int salery) {
		this.salery = salery;
	}

}

public class Encapsulation {

	public static void main(String[] args) {

		Employe emp = new Employe();

		emp.setID(8500);
		emp.setName("Tejas");
		emp.setSalery(25000);

		System.out.println(emp.getID());
		System.out.println(emp.getName());
		System.out.println(emp.getSalery());

	}

}
