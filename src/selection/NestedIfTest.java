package selection;

public class NestedIfTest {

	/*
	 * ============= Nested if else ========== syntax :
	 * 
	 * if(condition-1){
	 * 
	 * if(condition-2){
	 * 
	 * ................ ................ .................
	 * 
	 * }else{ //statements-2 }
	 * 
	 * }else{ //statements-1 }
	 * 
	 */

	public static void main(String[] args) {

		String citizen = "indian";
		int age = 40;
		String voterId = "Yes";

		if (citizen.equals("nepali")) {

			if (age >= 18) {

				if (voterId.equals("Yes")) {

					System.out.println("You can vote");

				} else {
					System.out.println("sorry! you dont have voteid");
				}

			} else {
				System.out.println("You are under age");
			}

		} else {

			System.out.println("citizen not valid");
		}

	}

}
