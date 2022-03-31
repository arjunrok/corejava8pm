package methodoverriding;

public class NabilBak extends CentralBank{
	
	@Override
	protected String getBankName() {
		 
		return "Nabil Bank";
	}
	
	@Override
	protected int getInterestRate() {
		 
		return 10;
	}

}
