package abstraction;

public class TestInterface {
	
	public static void main(String[] args) {
		
		UserService us = new UserServiceImpl();
		
		us.addUser();
		us.deleteUser();
		us.print();
	}

}
