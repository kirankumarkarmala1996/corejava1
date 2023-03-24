package com.arrayconcepts;

public class TwoDimentionArray {
	public static void main(String[] args) {
//		int num[][]= new int [10][20];//or else 
		int num [][]= {{10,20,30},{40,50,60},{70,80,90}};
		
//		num [0][0]=10;
//		num [0][1]=20;
//		num [0][2]=30;
		
		for(int i=0;i<3;i++) {
			for(int j =0;j<3;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		}
		
	
}
