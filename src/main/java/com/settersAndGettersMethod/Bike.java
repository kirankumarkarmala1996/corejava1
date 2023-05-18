package com.settersAndGettersMethod;

/**
 * @author kiran
 *
 */
public class Bike extends Vehical {
//	if you want to access the parent class variable you want to create the super class constructor

	private String handel;
	private String vehicalName;

	public Bike() {
//		super();
		this.handel = "Shot";

	}

	public Bike(int sno, String vehicalName, int ccNUM, double cost) {
		super(sno, vehicalName, ccNUM, cost);
		this.handel = "Shot";
	}
	public Bike( String vehicalName) {
		this.vehicalName =vehicalName;
		
	}

	public String getHandel() {
		return handel;
	}

	@Override
	public String toString() {
		return "Bike [getHandel()=" + getHandel() + ", getSno()=" + getSno() + ", getVehicalName()=" + getVehicalName()
				+ ", getCcNUM()=" + getCcNUM() + ", getCost()=" + getCost() + "]";
	}

}
