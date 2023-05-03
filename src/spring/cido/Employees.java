package spring.cido;

public class Employees {
	private int id;
	private String name;
	private Address address;
	
	
	public Employees() {
		System.out.println("default construtor");
	}
	
	public Employees(int id, String name, Address address) {
		super();
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void show() {
		System.out.println(id +" "+name);
		System.out.println(address.toString());
	}

}
