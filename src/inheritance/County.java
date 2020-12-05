package inheritance;

public class County extends City {

	private String countyName;
	private int zipcode;
	
	public County(String countyName, int zipcode, String cityName, int counties, String stateName, int statePop) {
		super(cityName, counties, stateName, statePop);
		this.countyName = countyName;
		this.zipcode = zipcode;
	}
	public String getCountyName() {
		return this.countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	public int getZipcode() {
		return this.zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
		
	public String toString() {
		String pResult = super.toString();
		String result = pResult + "\ncountyName " + this.countyName + "\nzipcode " + this.zipcode;
		return result;
			
	}
	
	
}
