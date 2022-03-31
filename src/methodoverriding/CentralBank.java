package methodoverriding;

public class CentralBank {

	protected String getBankName() {

		return "Central Bank";
	}

	
	protected int getInterestRate() {

		return 0;
	}

	public void displayMoneyExRate() {

		System.out.println("Yen 10 = 10");
		System.out.println("KDD  1 = 15");
		System.out.println("$1 = 118");
	}
}
