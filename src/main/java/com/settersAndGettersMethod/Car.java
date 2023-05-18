package com.settersAndGettersMethod;


public class Car {
	private String carName;
	private String color;
	private int speed;
	private double cost;
	
	public Car() {
		carName="MG";
		color="blue";
		speed=5;
		cost=110000;
	}

	public Car(String carName, String color, int speed, double cost) {
		super();
		this.carName = carName;
		this.color = color;
		this.speed = speed;
		this.cost = cost;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

//	public void setCarName(String carName) {
//		this.carName = carName;
//	}
//	public String getcarName() {
//		return carName;
//	}
//	
//	public void setColor(String color) {
//		this.color=color;
//	}
//	
//	public String getColor() {
//		return color;
//	}
//	
//	public void setSpeed(int speed) {
//		this.speed=speed;
//	}
//	public int getSpeed() {
//		return speed;
//	}
//	
//	public void setCost(double cost) {
//		this.cost=cost;
//	}
//	
//	public String getCarName() {
//		return carName;
//	}
//	public double getCost() {
//		return cost;
//	}

	public String run() {
		if(carName.equals("MG")&&color.equals("blue")&&cost>100000&&speed>0) {
			return "running";
		}else {
			return "Not runnig";
		}
	}

}
