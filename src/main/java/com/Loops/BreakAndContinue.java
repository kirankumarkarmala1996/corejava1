package com.Loops;

public class BreakAndContinue {
	public static void main(String[] args) {
//	Break	
//		for(int i=0;i<=10;i++) {
//			System.out.println(i);
////			using break  Iterations and it will iterations only once;
//			break;
//		}

//  continue;
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
//	By Using continue Statement it will skip(where condition matches ).
// and it will continue the flow of application.
				continue;
			}
			System.out.println(i);


		}
		System.out.println("-------------");

//	how many number of time it will skip
		for (int j = 0; j <= 12; j++) {
			if (j % 5 == 0) {
				System.out.println(j);
				continue;
			}
		}
	}

}
