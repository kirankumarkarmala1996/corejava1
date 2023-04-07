package com.method;

public class MethodReturns {
	public static void main(String[] args) {
		
//		System.out.println("area of rectangle :"+areaOfRectangle0(0, 0));
		
		System.out.println("area of rectangle :"+areaOfRectangle(14.2, 22.15));
//		(or)
		 double area=areaOfRectangle(11.2, 45.10);
		 System.out.println(area);
		
	}
//	if we use to print directly using string concatenation it will throw an error
//	"The operator + is undefined for the argument type(s) String, void")
	public static void areaOfRectangle0(double area,double width) {
		System.out.println( area*width);
	}
	

	public static double areaOfRectangle(double area,double width) {
		return area*width;
	}
}
