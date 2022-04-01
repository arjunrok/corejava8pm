package abstraction;

public class TestBank {
	
	public static void main(String[] args) {
		
		CentralBank  b = new NabilBank();
		
		System.out.println("Bank Name = "+b.getBankName());
		System.out.println("Interest Rate = "+b.getInterestRate());
		
	}

}
