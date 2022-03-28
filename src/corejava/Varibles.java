package corejava;

import java.util.Scanner;

public class Varibles {
	
	/*
	 *   =============== Variable ====================
	 *   # use to store data in program.
	 *   
	 *   Syntax :
	 *      data_type var_name;
	 *      
	 */
	
	   public static void main(String[] args) {
		
		   //500,800
		   
		   int a;
		   int b;
		   
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter value of a ");
		   a = sc.nextInt();
		   
		   System.out.println("Enter value of b ");
		   b= sc.nextInt();
		   
		   int sum = a + b;
		   System.out.println("Total = "+sum);
	}
}
