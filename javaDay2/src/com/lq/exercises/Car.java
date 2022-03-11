

public class Car {
	
	private int speed;
	private int gasoline;
	private boolean engineState;
	
	Car (int s, int g, boolean es){
		speed = s;
		gasoline = g;
		engineState = es;
	}
	
	public void setSpeed ( int s ) {
		
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setGasoline( int s ) {
		
		gasoline = s;
	}
	
	public int getGasoline() {
		return gasoline;
	}
	
	public void setEngineState ( boolean s ) {
		
		engineState = s;
	}
	
	public boolean isEngineState () {
		
		return engineState;
	}
}

