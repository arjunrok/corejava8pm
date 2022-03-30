package aggregation;

public class Test {
	
	public static void main(String[] args) {
		
		Car  c = new Car();
		c.setColor("Black");
		c.setCompany("Tesla");
		c.setModel("MB700");
		c.setPrice(95000000);
		
		Employee  emp = new Employee();
		emp.setId(1234);
		emp.setName("Ram");
		emp.setCity("Kathmandu");
		emp.setSalary(300000);
		emp.setPost("CEO");
		emp.setCar(c);
		
		System.out.println("Id = "+emp.getId());
		System.out.println("Name  = "+emp.getName());
		System.out.println("City = "+emp.getCity());
		System.out.println("Salary = "+emp.getSalary());
		
		System.out.println("==========car info ===========");

		System.out.println("Model = "+emp.getCar().getModel());
		System.out.println("Color = "+emp.getCar().getColor());
		System.out.println("Company = "+emp.getCar().getCompany());
	}

}
