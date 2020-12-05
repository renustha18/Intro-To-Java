package exception;

public class CheckPercentage {
	
	public boolean checkPercentage(double percentage)  throws NotEnoughPercentageException {
		
		if (percentage > 80) {
			return true;
		}
		else {
			NotEnoughPercentageException exc = new NotEnoughPercentageException(percentage);
			throw exc;
			
		}
		
	}

}
