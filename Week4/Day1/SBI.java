package week4.day1;

public class SBI extends Axis implements RBI,Inter {

	@Override
	public void knowYourCustomer() {
		System.out.println("aadhar");
		
	}

	@Override
	public void withDrawalLimit() {
		System.out.println("1000");
	}
	
	public void goldLoan() {
		System.out.println("5%");
	}
	public static void main(String[] args) {
		SBI s=new SBI();
		s.goldLoan();
		s.housingLoan();
	}

	@Override
	public void design() {
		
		
	}
	
}
