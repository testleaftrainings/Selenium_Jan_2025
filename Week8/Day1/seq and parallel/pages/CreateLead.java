package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLead extends BaseClass {
	
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateLead enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
		
	}
	
	public CreateLead enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saran");
		return this;
		
	}
	
	public CreateLead enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		return this;
		
	}
	
	public ViewLeads clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeads(driver);
		
		
	}

}
