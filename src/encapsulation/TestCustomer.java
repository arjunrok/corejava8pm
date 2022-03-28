package encapsulation;

public class TestCustomer {
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		  c.setId(709);
		  c.setFname("Hari");
		  c.setLname("Karki");
		  c.setAge(55);
		  c.setCity("Kathmandu");
		
//		System.out.println("Id = "+c.getId());
//		System.out.println("FirstName = "+c.getFname());
//		System.out.println("LastName = "+c.getLname());
//		System.out.println("Age = "+c.getAge());
//		System.out.println("city = "+c.getCity());
		  
		  System.out.println(c);
		
	}
	
	
	
	

}
