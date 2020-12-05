package class_examples;

public class MathLibrary {

	public double areaOfTriangle(double base, double height) {
		double area = 1.0/2*base*height; 
		return area; 
	}
	
	public double areaOfCircle(double radius) {
		double area = radius*radius;
		return area;
	}
	
	public double areaOfRectangle(double length, double breadth) {
		double area = length * breadth;
		return area;
	}
	
	public double areaOfSquare(double length) {
		double area = length*length;
		return area;
	}
	
	
}
