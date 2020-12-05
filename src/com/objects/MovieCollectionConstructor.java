package com.objects;

public class MovieCollectionConstructor {

	public static void main(String[] args) {
		
		MovieCollection mc1 = new MovieCollection();  // calling default constructor
		
		mc1.setMovieName("Dangal");
		mc1.setYear(2016);
		mc1.actor = "Amir";
		
		
		System.out.println(mc1.getMovieName());
		System.out.println(mc1.getYear());
		System.out.println(mc1.actor);
		
		mc1.setMovieName("Superstar");
		mc1.setYear(2017);
		
		System.out.println("*****************************************");
		
		System.out.println("The new movie is " + mc1.getMovieName());
		System.out.println("The new movie year is " + mc1.getYear());
		
		System.out.println("*****************************************");
		
		//calling parameterized constructor
		MovieCollection mc2 = new MovieCollection("jumanji", 2018, "Dwayne Johnson"); 
		System.out.println(mc2.getMovieName());
		System.out.println(mc2.getYear());
		System.out.println(mc2.actor);
		
		mc2.setYear(2019);
		
		System.out.println("********************");
		
		System.out.println(mc2.getYear());
		

		
		

	}

}
