package inheritance;

public class Triangle extends MathLibrary {
	private double base;
	private double height;
	
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;	
	}


	public double getBase() {
		return this.base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getHeight() {
		return this.height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {  
		double area = super.areaOfTriangle(this.base, this.height); 
		return area;  
		
		
	}
	
	
	

}
