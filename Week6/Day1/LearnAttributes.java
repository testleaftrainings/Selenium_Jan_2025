package testcases;

import org.testng.annotations.Test;

public class LearnAttributes {
	@Test(invocationCount=2,timeOut=100)
	public void createLead() {
		System.out.println("lead is created");
	}
	@Test(priority=-2)
	public void deleteLead() {
		System.out.println("lead is deleted");
	}
	
	@Test(priority=2,enabled=false)
	public void mergeLead() {
		System.out.println("lead is merged");
	}
	@Test(priority=-1,dependsOnMethods= {"createLead"})
	public void editLead() {
		System.out.println("lead is editted");
	}
	@Test(priority=-1)
	public void duplicateLead() {
		System.out.println("lead is duplicated");
	}

}
