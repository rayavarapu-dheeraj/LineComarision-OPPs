package com.bridgelabz.linecomparision;

import java.util.Scanner;

class Utility {
	static final Scanner SC = new Scanner(System.in);
	static int x1 = SC.nextInt();
	static int y1 = SC.nextInt();
	static int x2 = SC.nextInt();
	static int y2 = SC.nextInt();

	public static void calculateLength() {
		double lengthLine1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of Line 1 = " + lengthLine1);
		System.out.print("Enter the value of (x1,y1)= ");
	}
}
