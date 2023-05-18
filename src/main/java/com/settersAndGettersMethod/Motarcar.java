package com.settersAndGettersMethod;

/**
 * @author kiran
 *
 */
public class Motarcar {

	private int weel;
	private String carName;
	private String engin;
	private String Fuel;

	public Motarcar() {
		super();
		this.weel = 4;
		this.carName = "Ronald";
		this.engin = "Power";
		this.Fuel = "Deseal";
		// TODO Auto-generated constructor stub
	}

	

	public Motarcar(int weel, String carName, String engin, String fuel) {
		super();
		this.weel = weel;
		this.carName = carName;
		this.engin = engin;
		this.Fuel = fuel;
	}

	
	public Motarcar( String carName) {

		this.carName = carName;
	}


	public int getWeel() {
		return weel;
	}

	public String getCarName() {
		return carName;
	}

	public String getEngin() {
		return engin;
	}

	public String getFuel() {
		return Fuel;
	}
	
	

}
