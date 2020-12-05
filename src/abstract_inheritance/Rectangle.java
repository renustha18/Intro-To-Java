package abstract_inheritance;

public class Rectangle extends MathFunction {
	private double length, breadth;
	
	public Rectangle() {
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		double area = this.length * this.breadth;
		return area;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = 2 * (this.length + this.breadth);
		return perimeter;
	}
	
	

}
