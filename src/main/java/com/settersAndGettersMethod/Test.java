package com.settersAndGettersMethod;

public class Test {
	public static void main(String[] args) {
		Bike bike = new Bike(24, "MG", 102015, 50000);
//		System.out.println(bike.getHandel());
//		System.out.println(bike.getCcNUM());
//		System.out.println(bike.getCost());
//		System.out.println(bike.getSno());
		System.out.println(bike.getVehicalName());
		
		
////		if you use object ref  directly to print it will print object stored area
//		System.out.println(bike);//com.settersAndGettersMethod.Bike@156643d4

////		After override the toString method it will print the object values
//		System.out.println(bike);
		
		MotarVehical ve= new MotarVehical(2,"Messi","Megha power","white petrol");
//		System.out.println(ve);
		System.out.println(ve.getCarName());
		
	}

}
