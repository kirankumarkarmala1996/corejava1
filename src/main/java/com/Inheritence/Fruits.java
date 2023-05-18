package com.Inheritence;

/**
 * @author kiran
 *
 */
public class Fruits {

	protected int noOfPeace;
	private String FruitName;
	private double weight;
	private float cost;

	public Fruits() {
		this.noOfPeace = 0;
		this.FruitName = null;
		this.weight = 0;
		this.cost = 0;
	}

	public String showInfo() {
		return "Fruits [noOfPeace=" + noOfPeace + ", FruitName=" + FruitName + ", weight=" + weight + ", cost=" + cost
				+ "]";
	}
	
	

}