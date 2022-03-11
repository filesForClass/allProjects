package com.lq.vehicle;

public class StationWagon extends Car {
	
	@Override 
	public void setSpeed(int speed) {
		if(speed > 10 && speed < 100) {
			this.speed = 50;
		}
		else {
			this.speed = speed;
		}
	}
	
	
}
