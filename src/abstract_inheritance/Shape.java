package abstract_inheritance;

public class Shape {

	public static void main(String[] args) {
		
		Square sq = new Square(10);
		
		double area = sq.calculateArea();
		double perimeter = sq.calculatePerimeter();
		
		System.out.println (area);
		System.out.println(perimeter);

	
	
		Rectangle rec = new Rectangle(6, 7);
		double area1 = rec.calculateArea();
		double perimeter1 = rec.calculatePerimeter();
		
		System.out.println(area1);
		System.out.println(perimeter1);
		
	}
}
