package com.core.abstraction;

public class LoftHouse extends House{

	private int story;
	private String houseDesign;
	
	public LoftHouse() {
		
	}

	public LoftHouse(int story, String houseDesign) {
		this.story = story;
		this.houseDesign = houseDesign;
	}

	public int getStory() {
		return this.story;
	}

	public void setStory(int story) {
		this.story = story;
	}

	public String getHouseDesign() {
		return this.houseDesign;
	}

	public void setHouseDesign(String houseDesign) {
		this.houseDesign = houseDesign;
	}

	@Override
	public void printStory() {
		int story = this.story;
		System.out.println(story);	
	}
	
	@Override
	public void printHouseDesign() {
		String design = this.houseDesign;
		System.out.println(design);	
	}	
}
