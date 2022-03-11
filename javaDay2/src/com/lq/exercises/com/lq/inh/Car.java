package com.lq.inh;

public class Car implements ICar {
		
	private int speed;
	private int maxSpeed;
	private int gasoline;
	private boolean engineState;
	private String model;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getGasoline() {
		return gasoline;
	}
	public void setGasoline(int gasoline) {
		this.gasoline = gasoline;
	}
	public boolean isEngineState() {
		return engineState;
	}
	public void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	


}
