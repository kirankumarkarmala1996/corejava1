package com.ConditionalOperators;


public class Switchstatement {
	public static void main(String[] args) {
		int i = 10;													//lowest index =0;
		int j = 1/10;												//highest index =5;
																	//length of index=4;				
//		int j =i/1;													//HI=L-1 =>4-1 = 3
//		int a=0/1;													
//		int s=0/0;//exception										//length =HI+1
//		int d= 1/0;//exception arithmetic							//lowest index =0;
		
		
		System.out.println(j);//0
//		System.out.println(a);
//		System.out.println(a);
		
		int abc=22;
		
		switch (abc) {
		case 10:
			System.out.println(10);
			break;
		case 12:
			System.out.println(12);
			break;
		case 20:
			System.out.println(25);
			break;
		default:
			System.out.println("enter the currect number");
			break;
		}
		
		
		if(abc ==10) {
			System.out.println(10);
//			break;//break cannot be used outside of the loop or switch
		}else if (abc==20) {
			System.out.println(20);
		}else if (abc==25) {
			System.out.println(25);
		}else if(abc==22) {
			System.out.println(22);
		}
		else {
			System.out.println("enter the correct number");
		}
		
//		if we write like this it will take time process because of if condition
//		if statement is find again unnecessarily it will check all the (ifcondition)
		if(abc ==10) {
			System.out.println(10);
		}if(abc==20) {
			System.out.println(20);
			
		}if(abc==30) {
			System.out.println(30);
		}else {
			System.out.println("enter the correct number");
		}
		
		int a[]= new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		System.out.println(a[4]);
		
		System.out.println((a[0]+a[1])+"test");
	}

}
