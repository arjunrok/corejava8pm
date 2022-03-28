package constructor;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of length");
        int l = sc.nextInt();
        
        System.out.println("Enter value of breadth");
        int b = sc.nextInt();
		
		Area a1 = new Area(l, b);
		a1.printArea();
	}
	
}
