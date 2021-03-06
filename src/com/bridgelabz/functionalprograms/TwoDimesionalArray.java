package com.bridgelabz.functionalprograms;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimesionalArray {
	public static void main(String[] args) {
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		PrintWriter pw = new PrintWriter(osw, true);
		Scanner scanner = new Scanner(System.in);

		pw.println("Enter number of rows (M): ");
		int m = scanner.nextInt();
		pw.println("Enter number of columns (N): ");
		int n = scanner.nextInt();
		pw.println("Enter your choice:\n 1) Integer\t2) Double\t3) Boolean");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			int integerArray[][] = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					integerArray[i][j] = scanner.nextInt();
					pw.print(integerArray[i][j] + " ");
				}
				pw.print("\n");
			}
			break;
		case 2:
			double doubleArray[][] = new double[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					doubleArray[i][j] = scanner.nextDouble();
					pw.print(doubleArray[i][j] + " ");
				}
				pw.print("\n");
			}
			break;
		case 3:
			boolean booleanArray[][] = new boolean[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					booleanArray[i][j] = scanner.nextBoolean();
					pw.print(booleanArray[i][j] + " ");
				}
				pw.print("\n");
			}
			break;

		default:
			pw.println("Invalid Choice!");
			break;
		}
		pw.flush();
		scanner.close();
	}
}
