package com.lq.vehicle;

public class SportsCar extends Car {
	
	private static final int MAX_SPEED = 200;
	
	
	public void setSpeed(int speed) throws Exception {
		if (speed > 200) {
			
			throw new Exception("");
			
		}
		else {
			this.speed = speed;
		}
	}
	
	
}
