package selection;

public class SwitchTest {

	/*
	 * ============ switch =========== syntax :
	 * 
	 * switch(variable/expression){
	 * 
	 * case 1 : //statements break;
	 * 
	 * case 2 : //statements break; .............. .......... ..............
	 * 
	 * default : //statements
	 * 
	 * }
	 */

	public static void main(String[] args) {

		int day = 30;

		switch (day) {

		case 1:
			System.out.println("Sunday");
			break;

		case 2:
			System.out.println("Monday");
			break;

		case 3:
			System.out.println("Tuesday");
			break;

		case 4:
			System.out.println("Wednesday");
			break;

		case 5:
			System.out.println("Thursday");
			break;

		case 6:
			System.out.println("Friday");
			break;

		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("invalid input");

		}

	}
	
	/*
	 *     Q1> WAP to print result of two given integer values 
	 *         on the basis of operator.[+,-,*,/]
	 *         
	 *     Q2> WAP to calculate total salary of following post :
	 *         
	 *          post		basic salary 	bonus 		total Salary 
	 *          ------		------------	------		--------------
	 *          MD     		  3000000		18%             ?
	 *          CEO			  250000        15%    			?
	 *          MANAGER       100000		8.9%			?
	 *          HELPER		  50000		    12%				?
	 */
	
	
	
	
	

}
