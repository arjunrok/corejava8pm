package array;

import java.util.Scanner;

public class MultiDArray {
	
	/*
	 *     ================== MultiDArray ===========
	 *     # use to processing data in the form of matrix or table.
	 *     
	 *     syntax :
	 *     
	 *     data_type array_name[][] = new data_type[row-size][col-size];
	 *     
	 */

	  public static void main(String[] args) {
		
		  
		    int mat[][] = new int[2][2];
		    
		    /*        c0 	c1
		     *    R0  []	[]
		     *    R1  []	[]
		     *      
		     */
		    
		    Scanner sc = new Scanner(System.in);
		    
		    //write data in multiDArray
		    
		      for(int i=0; i<2; i++) {
		    	  
		    	    for(int j=0; j<mat[i].length; j++) {
		    	    	
		    	    	System.out.println("Enter value ");
		    	    	mat[i][j] = sc.nextInt();
		    	    }
		      }
		  
		      
		 //read data from multiDArray
		      
		      System.out.println("Row    Col");
		      for(int i=0; i<2; i++) {
		    	  
		    	    for(int j=0; j<mat[i].length; j++) {
		    	    	
		    	    	 System.out.print(mat[i][j]+"\t");
		    	    }
		    	    
		    	    System.out.println();
		      }
		  
		      
	}
	
}
