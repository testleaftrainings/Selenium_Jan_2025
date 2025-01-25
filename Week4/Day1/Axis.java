package week4.day1;

public class Axis implements RBI {

	@Override
	public void knowYourCustomer() {
		System.out.println("Pan card");
	}

	@Override
	public void withDrawalLimit() {
		System.out.println("10000");
		
	}
	public void housingLoan() {
		System.out.println("25,000000");
	}
	public static void main(String[] args) {
		Axis a=new Axis();
		a.housingLoan();
		a.knowYourCustomer();
	}

}
