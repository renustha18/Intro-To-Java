package inheritance;

public class EmployeeRecord {

	public static void main(String[] args) {
		
		HrlyEmployee emp1 = new HrlyEmployee(20, 40, "Renu", 101, "Nutrition");
		
		String record1 = emp1.toString();
		System.out.println(record1);
		
		HrlyEmployee emp2 = new HrlyEmployee(30, 40, "Sujan", 102, "Computer");
		
		String record2 = emp1.toString();
		System.out.println(record2);
	}

}
