package inheritance;

public class HrlyEmployee extends Employee{
	private double hrlyRate;
	private int weeklyhrs;
	
	public HrlyEmployee() {
		
	}

	public HrlyEmployee(double hrlyRate, int weeklyhrs,String empName, int empID, String empDept) {
		super(empName, empID, empDept);
		this.hrlyRate = hrlyRate;
		this.weeklyhrs = weeklyhrs;
	}

	public double getHrlyRate() {
		return this.hrlyRate;
	}

	public void setHrlyRate(double hrlyRate) {
		this.hrlyRate = hrlyRate;
	}

	public int getWeeklyhrs() {
		return this.weeklyhrs;
	}

	public void setWeeklyhrs(int weeklyhrs) {
		this.weeklyhrs = weeklyhrs;
	}
	
	public String toString() {
		String presult = super.toString();
		String message = presult + " hrly Rate is " + this.hrlyRate + " weekly hours is " + this.weeklyhrs;
		return message;
	}
	
	

}
