package constructor;

public class Area {
	
	int length;
	int breadth;
	
	Area(int length, int breadth){
		
		this.length = length;
		this.breadth = breadth;
	}

	void printArea() {
		
		int area = length * breadth;
		System.out.println("Area  = "+area);
	}
	
}
