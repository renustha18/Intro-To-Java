package inheritance;

public class Inheritance_child extends Inheritance_Parent{
	
	private String name;
	private int apt;
	
	public Inheritance_child() {	
	}

	public Inheritance_child(String name, int apt) {
		this.name = name;
		this.apt = apt;	
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getApt() {
		return this.apt;
	}

	public void setApt(int apt) {
		this.apt = apt;
	}
	
	
}
