package inheritance;

public class City extends State{
	private String cityName;
	private int counties;
	
	//if we make parameterized constructor, we have to explicitly define default constructor
	public City() {
		
	}
	
	public City(String cityName, int counties, String stateName, int statePop) {
		super(stateName, statePop);
		this.cityName = cityName;
		this.counties = counties;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getCounties() {
		return this.counties;
	}

	public void setCounties(int counties) {
		this.counties = counties;
	}
	
	public String toString() {
		String pResult = super.toString();
		String result =  pResult + "\ncityName " + this.cityName + "\nnum of counties " + this.counties;
		return result;
		
	}
	
	
	
	

}
