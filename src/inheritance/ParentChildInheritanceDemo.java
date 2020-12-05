package inheritance;

public class ParentChildInheritanceDemo {

	public static void main(String[] args) {
		
		
		Inheritance_Parent p1 = new Inheritance_Parent( "Sanu Kaji", "honda", " hyundai", 2);
		String name1 = p1.getName();
		String bike1 = p1.getbike();
		String car1 = p1.getcar();
		int house1 = p1.gethouse();
		
		
		System.out.println( name1 + " has " + bike1 + " bike " + car1 + " car " + house1 + " house ");
		
		Inheritance_child ch1 = new Inheritance_child("renu", 1);

		String name = ch1.getName();
		int apt = ch1.getApt();
		
		System.out.println(name + " has " + apt + " apt ");
		
		
		
		
		
		
		//Beginning of Inheritance
		
		Inheritance_child ch2 = new Inheritance_child("sujan", 1);
		ch2.setbike("FZ");
		ch2.setcar("Hyundai");
		ch2.sethouse(2);
		
		String name2 = ch2.getName();
		String bike2 = ch2.getbike();
		String car2 = ch2.getcar();
		int house2 = ch2.gethouse();
		int apt2 = ch2.getApt();
		
		
		System.out.println( name2 + " has " + bike2 + " bike " + car2 + " car " + house2 + " house " + apt2 + "apt");
		
		
		Inheritance_child ch3 = new Inheritance_child("sabina", 1);
		ch3.setbike("Dio");
		
		String name3 = ch3.getName();
		String bike3 = ch3.getbike();
		int apt3 = ch3.getApt();
		System.out.println(name3 + " has " + bike3 + " bike " + apt3 + " apt ");
	}

}
