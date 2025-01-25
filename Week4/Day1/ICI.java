package week4.day1;

public class ICI extends ICICI{

	@Override
	public void knowYourCustomer() {
		System.out.println("VOterid");
		
	}

	@Override
	public void withDrawalLimit() {
		System.out.println("25,000");
	}

	@Override
	public void convertCurrency() {
		System.out.println("in Dollars");
		
	}
	public static void main(String[] args) {
		ICI i=new ICI();
		i.cibilScore();
		i.convertCurrency();
	}

}
