package arraywithmethod;

import java.util.Arrays;

public class ArrayWithMethodTest {
	
	/*
	 *   for(data_type  var : collection){
	 *   
	 *   }
	 */
	
	public static void main(String[] args) {
		
//		int  data[] = {30,66,8,98,27,18,29,4,78,90,2,675,7};
//		findSmallestValue(data);
		
		int[]  oddnos = getOddnosFrom1to100();
		System.out.println(Arrays.toString(oddnos));
	}
	
 //============ 1. array as arguments ==========================
  static void   findSmallestValue(int[] values) {
		
		int sv = values[0];
		
		for(int x : values) {
			
			 if(sv > x)
				 sv = x;
		}
		
		System.out.println("Smallest value = "+sv);
	}

  //================= 2. array as return type ======================
  
  static  int[] getOddnosFrom1to100() {
    	
    	   //create array to store odd numbers
    	  int[]   oddnos =  new int[50]; 
    	  int j = 0;
    	
    	  for(int i=1; i<=100; i++) {
    		  
    		    if(i%2 != 0) {
    		    	oddnos[j] = i;
    		    	j++;
    		    }
    	  }
    	return oddnos;
    }
  
}
