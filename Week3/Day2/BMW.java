package week3.day2;

public class BMW extends Car {
	public void voiceCommand() {
		System.out.println("voice cmd is enabled--->bmw class");
	}
	public void dashboardDisplay() {
		System.out.println("bmw classmessage is displayed--->");
	}
	public static void main(String[] args) {
		BMW b=new BMW();
		b.applyBreak();
		b.applyGear();
		b.dashboardDisplay();
	}
}
