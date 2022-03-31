package polymorphism;

public class MethodOverloadingTest {
	
	 void printArea(int l, int b) {
		 
		 int area = l * b;
		 System.out.println("Area of rectangel = "+area);
	 }
	 
	void printArea(int l) {
		
		int area = l*l;
		System.out.println("Area of square = "+area);
	}
	
	void printArea(double r) {
		
	    double area = Math.PI * Math.pow(r, 2);// 3.14 * r * r
	    System.out.println("Area of circle = "+area);
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingTest mt = new MethodOverloadingTest();
		
		mt.printArea(40, 50);
		mt.printArea(10.67);
		mt.printArea(9);
	}

}
