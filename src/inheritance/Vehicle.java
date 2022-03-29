package inheritance;

public class Vehicle {
	
	private String color;
	int size = 8;
	protected int door;
	public String model;
	
	public void printVehicle() {
		System.out.println("Color = "+color+"\n Size = "+size+"\n Door = "+door+"\nModel = "+model);
	}
	
}
