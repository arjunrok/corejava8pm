package looping;

public class EnhanceForTEst {
	
	/*
	 *     ============== enhance for loop ==============
	 *     # use to read data from collection.
	 *     
	 *     syntax :
	 *     
	 *      for(data_type var : collection){
	 *      
	 *          //statements
	 *      }
	 *     
	 */
	
	  public static void main(String[] args) {
		
		    int  values[] = {10,67,89,30,55,28,56,71,29};
		    
		    int s = 0;
		    
		    for(int  x  : values) {
		    	
		    	System.out.println(x);
		    	s = s + x;
		    }
		    
		    System.out.println("Total sum = "+s);
	}
}
