package abstraction;

public class EverestBank extends CentralBank{

	@Override
	protected String getBankName() {
		
		return "Everest Bank";
	}

	@Override
	protected int getInterestRate() {
	 
		return 18;
	}

}
