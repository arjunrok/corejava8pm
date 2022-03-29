package array;

import java.text.NumberFormat;
import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		//WAP to store age of 5 students.
		
		//array declaration/initiation object
		int age[] = new int[5];
		
		/*   0    1    2   3  4
		 *   [20][22][20][30][18]
		 *   <--     age     --->
		 *   
		 *   
		 */
		
		
		//write data in array
		
//		age[0] = 20;
//		age[1] = 22;
//		age[4] = 18;
//		age[2] = 20;
//		age[3] = 30;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<age.length; i++) {
			
			System.out.println("Enter your age");
			age[i] = sc.nextInt();
		}
		
		
     //read data from array
	  for(int x : age) {	
		   System.out.println(x);
	  }

	     
	  /*
	   *    Q1) WAP to store name of 5 students and display.
	   *    Q2) WAP to store price of 10 books and find out total,max and average price.
	   *    
	   */
	  
	  
	}

}
