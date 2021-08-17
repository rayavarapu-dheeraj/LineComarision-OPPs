package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class Linecomparision extends LineUtility {

	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("welcome to line comparision using oops concepts");
		System.out.print("Enter the value of (x1,y1)= ");
		int x1 = SC.nextInt();
		int y1 = SC.nextInt();
		int x2 = SC.nextInt();
		int y2 = SC.nextInt();

		calculateLength(x1, y1, x2, y2);

	}
}

class LineUtility {

	public static void calculateLength(int x1, int y1, int x2, int y2) {
		double lengthLine1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of Line 1 = " + lengthLine1);
	}
}