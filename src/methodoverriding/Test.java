package methodoverriding;

public class Test {

	public static void main(String[] args) {

		// static or early binding of object
		NabilBak nb = new NabilBak();

		System.out.println("Bank Name = " + nb.getBankName());
		System.out.println("Interest Rate = " + nb.getInterestRate());

		// up-casting
		CentralBank b = new LaxmiBank();
		
	}

	// late or dynamic binding of object or run time polymorphism
	void printBankInfo(CentralBank b) {

		System.out.println("Bank Name = " + b.getBankName());
		System.out.println("Interest Rate = " + b.getInterestRate());
	}

}
