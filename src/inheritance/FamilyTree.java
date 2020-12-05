package inheritance;

public class FamilyTree {
	public static void main(String args[]) {
		
		Child ch = new Child("Sujan", 28, "SanuKaji", "Sunkesari");
			
//		ch.setFatherName("SanuKaji");
//		ch.setMotherName("Sunkesari");	
			
		String result = ch.toString();
		System.out.println(result);
		
		
//		String fname = ch.getFatherName();
//		String mname = ch.getMotherName();
		
//		System.out.println("Mothername is " + mname + "\nFathername is " + fname + result);
				
	}

}
