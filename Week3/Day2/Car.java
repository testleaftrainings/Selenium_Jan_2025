package week3.day2;

public class Car extends Vehicle {
	public void applyGear() {
		System.out.println("it is under process---->car");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.applyGear();
		c.applyBreak();
		c.soundHorn();
	}
}
