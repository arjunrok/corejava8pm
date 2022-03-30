package object_with_method;

public class Product {
	
	private int pid;
	private String pname;
	private String company;
	private int price;
	private int quantity;
	
	public Product() {
		
	}
	
	public Product(int pid, String pname, String company, int price, int quantity) {
		this.pid = pid;
		this.pname = pname;
		this.company = company;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", company=" + company + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
}
