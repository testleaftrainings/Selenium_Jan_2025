package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLead extends BaseClass {
	
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateLead enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
		
	}
	
	public CreateLead enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
		
	}
	
	public CreateLead enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
		
	}
	
	public ViewLeads clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeads(driver);
		
		
	}

}
