package arraywithmethod;

import java.util.Scanner;

public class MultiDArray {
	
	/*
	 *    ================== MultiDArray ============
	 *    # use to store and processing data in matrix or table form.
	 *    
	 *    Syntax :
	 *    
	 *      data_type  array_name[][] = new data_type[row-size][col-size];
	 *    
	 */
	
	
	public static void main(String[] args) {
		
		int mat[][] = new int[2][2];
		/*       c0 	c1
		 *   R0  [60]	[50]
		 *   R1  [20]	[90]
		 */
		
		//write values in array
		
//		mat[0][0] = 60;
//		mat[0][1] = 50;
//		mat[1][0] = 20;
//		mat[1][1] = 90;
		
		Scanner sc = new Scanner(System.in);
		
		for(int row=0; row<2; row++) {
			
			  for(int col=0; col<2; col++) {
				  
				  System.out.println("enter value ");
				  mat[row][col] = sc.nextInt();
			  }
		}
		
		//read data from array
		
		  //System.out.println(mat[0][1]);
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<2; j++) {
				
				System.out.print(mat[i][j]+" ");
			}
			
			System.out.println();
			
		}
		
		
		
		
	}

}






