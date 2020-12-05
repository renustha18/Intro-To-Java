package inheritance;

public class Circle extends MathLibrary{
	
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		
		double area = super.areaOfCircle(this.radius);
		
		return area;
		
	}
	


}
