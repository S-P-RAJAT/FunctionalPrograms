package com.bridgelabz.functionalprograms;

public class Distance {
public static void main(String[] args) {
	int x = Integer.parseInt(args[0]), y = Integer.parseInt(args[1]);
	System.out.println("Euclidean distance: "+Math.sqrt(x*x+y*y));
}
}
