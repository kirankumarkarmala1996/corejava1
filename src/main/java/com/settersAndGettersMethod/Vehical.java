package com.settersAndGettersMethod;

public class Vehical {
	private int Sno;
	private String vehicalName;
	private int ccNUM;
	private double cost;

	public Vehical() {
		this. Sno=022121;
		this. vehicalName="royalenfield";
		this. ccNUM=0212;
		this. cost=250000;
	}

	public Vehical(int sno, String vehicalName, int ccNUM, double cost) {
		super();
		Sno = sno;
		this.vehicalName = vehicalName;
		this.ccNUM = ccNUM;
		this.cost = cost;
	}

	public int getSno() {
		return Sno;
	}

	public String getVehicalName() {
		return vehicalName;
	}

	public int getCcNUM() {
		return ccNUM;
	}

	public double getCost() {
		return cost;
	}
	
	

}
