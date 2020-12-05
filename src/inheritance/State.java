package inheritance;

public class State {
	private String stateName;
	private int statePop;
	
	public State() {
	}

	public State(String stateName, int statePop) {
		this.stateName = stateName;
		this.statePop = statePop;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getStatePop() {
		return this.statePop;
	}
	public void setStatePop(int statePop) {
		this.statePop = statePop;
	}

	public String toString() {
		String result = "stateName " + this.stateName + "\nstatePop " + this.statePop;
		return result;
	}
	
	
}
