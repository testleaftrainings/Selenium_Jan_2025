package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;

public class MyLeadsPage extends BaseClass {
	
	
	@And("click on createleads link")
	public CreateLead myLeads() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLead();
	}

}
