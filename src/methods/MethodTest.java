package methods;

import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {

		// sum();

//		  Scanner sc = new Scanner(System.in);
//		  System.out.println("Enter any number for Table");
//		  int x = sc.nextInt();
//		    printTable(x);

//		int x = getSumof1to100no();
//		System.out.println(" Total sum = " + x);
		
		//int sv = findSmallestValue(400,700);
		System.out.println("Result = "+findSmallestValue(400,700));

	}

	// 1. no return type with no arguments
	static void sum() {

		int a = 900;
		int b = 500;

		int s = a + b;
		System.out.println("Total sum = " + s);
	}

	// 2. no return type with arguments
	static void printTable(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}

	// 3. return type with no arguments

	static int getSumof1to100no() {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		return sum;
	}

	// 4. return type with arguments
	static int findSmallestValue(int x, int y) {

		if (x < y) {
			return x;
		}
		return y;
	}

	
	/*
	 *   Q1) WAP to find area of circle using method.
	 *   
	 *   Q2) Write a Program to print sum of 1 to nth natural numbers
	 *       using method.
	 *       
	 *   Q3) Write a program to print the factorial number of given number
	 *       using method.     
	 * 
	 */
	
	
}
