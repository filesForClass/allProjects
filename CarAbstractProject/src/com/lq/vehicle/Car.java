package com.lq.vehicle;

public abstract class Car {
	protected int speed;
	
	private boolean engineState;
	
	public boolean isEngineState() {
		return engineState;
	}

	public void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}

	public int getSpeed() {
		return speed;
	}


}