package com.classes;

public class EnumTutorial {

	public static void main(String[] args) {
		/*
		 * //// it will create the new exesting value by using new key word ////
		 * DaysOfTheWeek day = new DaysOfTheWeek(); // //// if you want to use the
		 * exesting value // DaysOfTheWeek day = DaysOfTheWeek.SUNDAY; // DaysOfTheWeek
		 * day1 = DaysOfTheWeek.MONDAY; // DaysOfTheWeek day2 = DaysOfTheWeek.TUESDAY;
		 * // // if (day.equals("Monday")) { // System.out.println("it almost monday");
		 * // }else { // System.out.println("sunday"); // }
		 */		 
		/*
		 * for(DaysOfTheWeek myday: DaysOfTheWeek.values()){ System.out.println(myday);
		 * }
		 */
		
		System.out.println(Fruits.BANANA.levelOfDelicious);
		
		
	}
}
