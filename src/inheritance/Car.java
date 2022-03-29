package inheritance;

public class Car extends Vehicle{
	
	  int size = 4;
	  int cc;
	  int gears;
	  
	  //'super'/'parent object' key word is use to represent parent class object.
	  // by using super keyword we can call properties,methods and constructor of parent class
	  
	  void carData() {
		  
		//  System.out.println("Color = "+color); color is private in parent class
		  System.out.println("Model = "+model);
		  System.out.println("Door = "+door);
		  System.out.println("Size = "+super.size);
		  System.out.println("cc = "+cc);
		  System.out.println("Gears = "+gears);
		  
		  super.printVehicle();
	  }
	  
	  public static void main(String[] args) {
		
		  Car c = new Car();
		  
		    c.cc = 1200;
		    c.gears = 6;
		    c.door = 6;
		    c.model = "Mb600";
		  
		   // c.printVehicle();
		    c.carData();
	}

}
