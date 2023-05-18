package com.settersAndGettersMethod;

/**
 * @author kiran
 *
 */
public class MotarVehical extends Motarcar{

	public MotarVehical() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MotarVehical(int weel, String carName, String engin, String fuel) {
		super(weel, carName, engin, fuel);
		// TODO Auto-generated constructor stub
	}
	public MotarVehical(String carName) {
		this.getCarName();
	}
	

	@Override
	public String toString() {
		return "MotarVehical [getWeel()=" + getWeel() + ", getCarName()=" + getCarName() + ", getEngin()=" + getEngin()
				+ ", getFuel()=" + getFuel() + "]";
	}
	
	
	
	
	


}
