package object_with_method;

public class Test {
	
	public static void main(String[] args) {
		
		 Test t = new Test();
		 
		 Product p = t.getProductData();
		 t.printProductData(p);
	}
	
	
	//=========== object as arguments ===========================
	
  	void  printProductData(Product product) {
		
		System.out.println("Id = "+product.getPid());
		System.out.println("Name = "+product.getPname());
		System.out.println("Company = "+product.getCompany());
		System.out.println("Price = "+product.getPrice());
		System.out.println("Quantity = "+product.getQuantity());
	}
  	
  	//=============== object as return type =====================
  	
	   Product getProductData() {
		   
		   Product  p = new Product();
			
			p.setPid(98700);
			p.setPname("Laptop");
			p.setCompany("DELL");
			p.setPrice(150000);
			p.setQuantity(500);
		   
		   return p;
	   }
	

}





