package abstraction;

public abstract class CentralBank {

	protected abstract String getBankName();
	protected abstract int getInterestRate();

	public void displayMoneyExRate() {

		System.out.println("Yen 10 = 10");
		System.out.println("KDD  1 = 15");
		System.out.println("$1 = 118");
	}
}
