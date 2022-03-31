package methodoverriding;

public class LaxmiBank extends CentralBank{
	
	@Override
	protected String getBankName() {
		 
		return "Laxmi Bank";
	}
	
	@Override
	protected int getInterestRate() {
		 
		return 18;
	}

}
