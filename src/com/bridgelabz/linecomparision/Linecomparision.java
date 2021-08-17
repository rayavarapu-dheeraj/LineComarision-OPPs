package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class Linecomparision extends LineUtility {

	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("welcome to line comparision using oops concepts");
		System.out.print("Enter the value of (x1,y1)= ");
		int x1 = SC.nextInt();
		int y1 = SC.nextInt();
		System.out.print("Enter the value of (x2,y2)= ");
		int x2 = SC.nextInt();
		int y2 = SC.nextInt();
		System.out.println("Enter the values of next co-ordinates ");
		System.out.print("Enter the value of (x3,y3)= ");
		int x3 = SC.nextInt();
		int y3 = SC.nextInt();
		System.out.print("Enter the value of (x4,y4)= ");
		int x4 = SC.nextInt();
		int y4 = SC.nextInt();

		calculateLength(x1, y1, x2, y2, x3, y3, x4, y4);

	}
}

class LineUtility {

	public static void calculateLength(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		double lengthLine1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double lengthLine2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		System.out.println("Length of Line 1 = " + lengthLine1);
		System.out.println("Length of Line 2 = " + lengthLine2);
		Integer num1 = new Integer((int) lengthLine1);
		Integer num2 = new Integer((int) lengthLine2);
		System.out.println("true if equal / false if not equal : \n" + num1.equals(num2));

	}
}