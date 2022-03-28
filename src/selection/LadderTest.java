package selection;

public class LadderTest {
	/*
	 * ============= if else ladder or else if ========
	 * 
	 * syntax :
	 * 
	 * if(condition-1){ //statements }
	 * 
	 * else if(condition-2){ //statements }
	 * 
	 * else if(condition-3){ //statements } ............... ....................
	 * .............. else{ //statements }
	 * 
	 */

	public static void main(String[] args) {

		int marks = 49;

		if (marks >= 80) {
			System.out.println("Distinction");
		}

		else if (marks >= 60) {
			System.out.println("First");
		}

		else if (marks >= 45) {
			System.out.println("Second");
		}

		else if (marks >= 32) {
			System.out.println("Third");
		} else {
			System.out.println("Failed");
		}
		
		
	}

}
