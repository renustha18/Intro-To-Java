package com.objects;

public class MovieCollection {

	private String movieName;
	private int year;
	public String actor;
	
	//Default constructor
	public MovieCollection() {
		
	}
	
	//Parameterized constructor
	public MovieCollection(String name, int year, String actor) {
		this.movieName = name;
		this.year = year;
		this.actor = actor;
	}
	
	
	public void setMovieName(String movieName) {
		this.movieName= movieName;
	}
	public String getMovieName() {
		return movieName; 
	}
	
	public void setYear(int year) {
		this.year= year;
	}
	public int getYear() {
		return year; 
	}
	
	
}

