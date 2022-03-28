package selection;

import java.util.Scanner;

public class PrimeCheckTest {

	public static void main(String[] args) {

		// int n = 41; //1 and 45 => prime number
		// 1 < n >45 => not prime
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter star value");
		int st = sc.nextInt();
		
		System.out.println("Enter end value");
		int ed = sc.nextInt();
		
		int cnt = 0;

		for (int n = st; n <= ed; n++) {

			boolean isPrimeNumber = true;

			for (int i = 2; i < n; i++) {

				if (n % i == 0) {
					isPrimeNumber = false;
					break;
				}
			}

			if (isPrimeNumber) {
				// System.out.println(n + " is prime number");
				 System.out.println(n);
				cnt++;
//			 }else {
//				 System.out.println(n + " is not prime number");
//			 }
			}
		}
		
		System.out.println("Tota prime numbers = "+cnt);
	}
}
