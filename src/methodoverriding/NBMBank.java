package methodoverriding;

public class NBMBank extends CentralBank {

	@Override
	protected String getBankName() {

		return "NBM Bank";
	}

	@Override
	protected int getInterestRate() {
		
		return 15;
	}
}
