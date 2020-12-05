package inheritance;

public class MathLibraryDemo {

	public static void main(String[] args) {
		
		Circle mlc = new Circle(5);
		double area = mlc.getArea();
		
		System.out.println(area);
		
		Triangle tr1 = new Triangle(5, 5);
		double area1 = tr1.getArea();
		System.out.println(area1);
		
	
	}

}
