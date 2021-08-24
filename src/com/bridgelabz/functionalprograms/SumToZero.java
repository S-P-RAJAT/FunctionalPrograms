package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class SumToZero {
	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int N = scanner.nextInt();
		System.out.println("Enter the array elements:");
		int array[] = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.print(array[i] + " ");
						System.out.print(array[j] + " ");
						System.out.print(array[k] + "\n");
						count += 1;
					}
				}
			}
		}
		System.out.println("The numbers of distinct triplets which sum to zero: " + count);
		scanner.close();
	}
}
