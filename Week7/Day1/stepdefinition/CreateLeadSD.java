package stepdefinition;

import org.openqa.selenium.By;

import hooksimplementation.Hooks;
import io.cucumber.java.en.When;

public class CreateLeadSD extends BaseClass {
	
	@When("click on crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	    
	}

	@When("click on leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	    
	}

	@When("click on createleads link")
	public void click_on_createleads_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	    
	}

	@When("enter the company name as (.*)$")
	public void enter_the_company_name_as_testleaf(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	    
	}

	@When("enter  the firstname as (.*)$")
	public void enter_the_firstname_as_saranya(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	    
	}

	@When("enter the lastname as (.*)$")
	public void enter_the_lastname_as_s(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		
	    
	}

	@When("click on the leads submit button")
	public void click_on_the_leads_submit_button() {
		
		driver.findElement(By.name("submitButton")).click();
	    
	}


}
