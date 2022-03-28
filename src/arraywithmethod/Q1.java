package arraywithmethod;

import java.util.Arrays;
import java.util.Collections;

public class Q1 {
	
	// Q1)  WAP to sort array data in ascending order using method
	
	  public static void main(String[] args) {
		
		  Integer data[] = {80,33,45,81,16,27,43,90,27,7};
		  
//		  int temp = 0;
//		  
//		  for(int i=0; i<data.length; i++) {
//			  
//			    for(int j=0; j<data.length; j++) {
//			    	
//			    	  if(data[i] > data[j]) {
//			    		  
//			    		  temp = data[i];
//			    		  data[i] = data[j];
//			    		  data[j] = temp;
//			    	  }
//			    }
//		  }
		  
		  Arrays.sort(data);
		  System.out.println(Arrays.toString(data));
		  
		  Arrays.sort(data,Collections.reverseOrder());
		  System.out.println(Arrays.toString(data));
		  
	}

}
