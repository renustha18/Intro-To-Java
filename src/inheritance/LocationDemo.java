package inheritance;

public class LocationDemo {

	public static void main(String[] args) {
		County ct1 = new County("Douglas", 68106, "Omaha", 5, "Nebraska", 3000000);
		
		
//		
//		String stname = ct1.getStateName();
//		int stpop = ct1.getStatePop();
//		String ctname = ct1.getCityName();
//		int numcounties = ct1.getCounties();
//		String cotname = ct1.getCountyName();
//		int zipcode = ct1.getZipcode();
//		
//		System.out.println(" State : " + stname);
//		System.out.println(" Population : " + stpop);
//		System.out.println(" City : " + ctname);
//		System.out.println(" Num of Counties : " + numcounties);
//		System.out.println(" County Name : " + cotname);
//		System.out.println(" Zipcode : " + zipcode);
//		
		
		String result = ct1.toString();
		
		
		System.out.println(result);
		

	}

}
