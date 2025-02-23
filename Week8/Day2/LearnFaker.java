package week7.day2;

import com.github.javafaker.Faker;

public class LearnFakee {

	public static void main(String[] args) {
		Faker fake=new Faker();
		String name = fake.company().name();
		System.out.println(name);
		
		String emailAddress = fake.internet().emailAddress();
		System.out.println(emailAddress);
		
		

	}

}
