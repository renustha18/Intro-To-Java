package abstract_inheritance;

public class Square extends MathFunction{
	private double length;
	
	public Square() {
		
	}

	public Square(double length) {
		
		this.length = length;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double calculateArea() {
		double area = this.length * this.length;
		return area;
	}
	public double calculatePerimeter() {
		double perimeter = 4 * this.length;
		return perimeter;
	}
	
	
	
	
}
