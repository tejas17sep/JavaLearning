package Constructor;

// without void int string only public is allowed 
// Same name as class name 
// at the time of object creation data is added
// method constructor function is same 
//method is also zero parameterized constructor and in background it calls it.

class Employee {

	private int ID;
	private String name;
	private int salery;

	public Employee(String string, int i, int j) {

	}

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

public class Constructor {
	public static void main(String args[]) {

		Employee emp = new Employee("Tejas", 8500, 25000);
		
		

	}
}
