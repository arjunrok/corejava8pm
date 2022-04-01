package abstraction;


public class NabilBank extends CentralBank{

	@Override
	protected String getBankName() {
		 
		return "Nabil Bank";
	}

	@Override
	protected int getInterestRate() {
		 
		return 15;
	}

	

}
