package object_with_method;

import java.util.Scanner;

public class ObjectWithArray {

	/*
	 * ================== Object with array ================
	 * 
	 * String sdata[] = new String[20]; 
	 * int data[] = new int[50]; data[0] = 500;
	 * data[1] = 30;
	 * 
	 * //product array Product products[] = new Product[10];
	 * 
	 * Product p1 = new Product(); p1.setId(4343); .....
	 * 
	 * Product p2 = new Product(); p2.setId(500); .....
	 * 
	 * products[0] = p1; products[1] = p2;
	 * 
	 * 
	 * // book array Book books[] = new Book[200];
	 * 
	 * books[0] = new Book(); books[1] = new Book(); books[2] = new Book();
	 * 
	 */

	public static void main(String[] args) {

		// WAP to store 5 product data.

		// read data from product array
		/*
		 * for(data_type var : collection){
		 * 
		 * }
		 */

		ObjectWithArray test = new ObjectWithArray();

		Product[] prods = test.getAllProducts();
		test.print(prods);

	}

	// ============= object array as arguments ========================
	void print(Product[] prods) {

		for (Product p : prods) {
			System.out.println(p);
		}
	}

	// =============== object array as return type ==================

	Product[] getAllProducts() {

		// create product array
		Product productList[] = new Product[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<productList.length; i++) {
			
			Product p = new Product();
			
			 System.out.println("Enter product id ");
			 p.setPid(scan.nextInt());
			  
			 System.out.println("Enter product name"); 
			 p.setPname(scan.next());
			 
			 System.out.println("Enter company name");
			 p.setCompany(scan.next());
			 
			 System.out.println("Enter product price");
			 p.setPrice(scan.nextInt());
			 
			 System.out.println("Enter quantity");
			 p.setQuantity(scan.nextInt());
			 
			productList[i] = p;
		}
		
//		Product p1 = new Product(109, "Mobile", "Samsung", 60000, 10);
//		Product p2 = new Product(111, "Laptop", "Dell", 150000, 200);
//		Product p3 = new Product(112, "Radio", "Samsung", 5000, 130);
//		Product p4 = new Product(123, "Computer", "Acer", 900000, 430);
//		Product p5 = new Product(155, "Glass", "CG", 4000, 900);
//
//		productList[0] = p1;
//		productList[1] = p2;
//		productList[2] = p3;
//		productList[3] = p4;
//		productList[4] = p5;

		return productList;
	}

}
