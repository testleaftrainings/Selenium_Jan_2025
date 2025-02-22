package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	
	@And("enter the company name as(.*)$")
	public CreateLead enterCompanyName(String cName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
		
	}
	@And ("enter  the firstname as(.*)$")
	public CreateLead enterFirstName(String fName) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
		
	}
	@And ("enter the lastname as(.*)$")
	public CreateLead enterLastName(String lName) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
		
	}
	@When("click on the leads submit button")
	public ViewLeads clickSubmit() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeads();
		
		
	}

}
