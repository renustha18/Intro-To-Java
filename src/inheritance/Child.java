package inheritance;

public class Child extends Parent{

	private String name;
	private int age;
	
	public Child() {
		
	}

	public Child(String name, int age, String fatherName, String motherName) {
		super(fatherName, motherName);
	
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		String presult = super.toString();
		String result = presult + "\nName is " + this.name + "\nAge is " + this.age;
		return result;
	}
	
	
		
}
