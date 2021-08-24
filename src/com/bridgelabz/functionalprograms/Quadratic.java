package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		System.out.println("Program to find roots of Quadratic equations");
		System.out.println("Enter the value of a, b, c:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double delta = b * b - 4 * a * c;

	    // check if determinant is greater than 0
	    if (delta >= 0) {

	      // two real and distinct roots
	      double root1 = (-b + Math.sqrt(delta)) / (2 * a);
	      double root2 = (-b - Math.sqrt(delta)) / (2 * a);

	      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
	    }  else {

	        // roots are complex number and distinct
	        double real = -b / (2 * a);
	        double imaginary = Math.sqrt(-delta) / (2 * a);
	        System.out.format("root1 = %.2f+%.2fi", real, imaginary);
	        System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
	      }
		sc.close();
	}
}
