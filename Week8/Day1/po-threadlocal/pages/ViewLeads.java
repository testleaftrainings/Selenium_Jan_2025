package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class ViewLeads extends BaseClass {
	
	
	@Then("viewLeadPage is displayed")
	public ViewLeads verifyLeads() {
		String text = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
		
		if (text.contains("saran")) {
			System.out.println("text matched");
			
		} else {
			System.out.println("text not matcheds");

		}
		return this;
	}

}
