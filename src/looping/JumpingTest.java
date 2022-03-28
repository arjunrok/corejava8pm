package looping;

public class JumpingTest {
	/*
	 *    ============= Jumping statements ========
	 *    
	 *    a> break;     : exit from loop
	 *    b> continue;  : skip values
	 *    c> return;    : exit from method
	 */
	
	public static void main(String[] args) {
		 
		for(int i=1; i<=10; i++) {
			
			if(i==6 || i == 9) {
				//break;
				//continue;
				return;
			}
			System.out.println(i);
		}
		
		System.out.println("end for loop");
	}
	
	/*
	 * Q1) WAP to check whether a given number is prime or not.
	 * Q2) WAP to print prime numbers from 200 to 500.
	 * Q3) WAP to count total prime numbers from 50 to 300.
	 */
}
