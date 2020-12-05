package inheritance;

public class Employee {
	
	private String empName;
	private int empID;
	private String empDept;
	
	public Employee() {
		
	}

	public Employee(String empName, int empID, String empDept) {
	
		this.empName = empName;
		this.empID = empID;
		this.empDept = empDept;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpID() {
		return this.empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpDept() {
		return this.empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	public String toString() {
		String message = " Emp name is " + this.empName + " ID is " + this.empID + " Department is " + this.empDept;
		return message;
	}

	
}
