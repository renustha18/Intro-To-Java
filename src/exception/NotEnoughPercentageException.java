package exception;

public class NotEnoughPercentageException extends Exception {
	

		public String message;
		
		public NotEnoughPercentageException() {
			
		}
		
		public NotEnoughPercentageException(double percent) {
			this.message = "Sorry You only have only " + percent + " percentage";
			
		}
		
		
}
