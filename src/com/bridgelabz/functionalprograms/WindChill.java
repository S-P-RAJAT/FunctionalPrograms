package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of t: ");
		double t = sc.nextDouble();
		System.out.print("Enter the value of v: ");
		double v = sc.nextDouble();
		if (Math.abs(t) <= 50 && (v >= 3 && v <= 120)) {
			double w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16);
			System.out.println("Effective Temperature (i.e wind chill): " + w);
		} else {
			System.out.println("Please enter correct values. The formula is"
					+ " not valid if t is larger than 50 in absolute value or"
					+ " if v is larger than 120 or less than 3");
		}
		sc.close();
	}
}
