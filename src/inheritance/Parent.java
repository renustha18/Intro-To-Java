package inheritance;

public class Parent {
	private String fatherName;
	private String motherName;
	
	public Parent() {
		
	}

	public Parent(String fatherName, String motherName) {
		
		this.fatherName = fatherName;
		this.motherName = motherName;
	}

	public String getFatherName() {
		return this.fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return this.motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String toString() {
		String result = "Father name is " + this.fatherName + "\nMother name is " + this.motherName;
		return result;
	}
	
}
