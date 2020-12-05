package class_examples;

public class Inheritance_Parent {
	private String name;
	private String bike;
	private String car;
	private int house;
	
	public Inheritance_Parent() {
		
	}
	
	public Inheritance_Parent(String name, String bike, String car, int house) {
		this.name = name;
		this.bike = bike;
		this.car = car;
		this.house = house;	
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setbike(String bike) {
		this.bike = bike;
	}
	
	public String getbike() {
		return this.bike;
	}
	
	public void setcar(String car) {
		this.car = car;
	}
	
	public String getcar() {
		return this.car;
	}
	
	public void sethouse(int house) {
		this.house = house;
	}
	
	public int gethouse() {
		return this.house;
	}

}


//Inheritance_Parent a= new Inheritance_Parent("honda",)