package looping;

public class ForTest2 {
	
	//WAP to print sum of 1 to 100.
	
	public static void main(String[] args) {
		
		int esum = 0;
		int osum = 0;
		
		for(int i=1; i<=100; i++) {
			
			//System.out.println(i);
			//sum = sum + i;
			
			if(i%2==0) {
				esum += i;   //esum = esum + i;
			}else {
				osum += i;
			}
		}
		
		System.out.println("Total sum of even no = "+esum);
		System.out.println("Total sum of odd no = "+osum);
		System.out.println("===========================");
		System.out.println("Total sum = "+(esum + osum));
	}

}
