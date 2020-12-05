package class_examples;

public class Restaurant {
	private String foodType;
	private int noOfEmployee;
	public String openDays;
	
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getNoOfEmployee() {
		return noOfEmployee;
	}
	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}
	
	public String message() {
		String message = "Welcome to my Restaurant";
		return message;
	}
		
	
}
