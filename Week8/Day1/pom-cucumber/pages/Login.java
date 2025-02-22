package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Login extends BaseClass {
	
	
	
	@When("enter the username as {string}")
	public Login enterUname(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
			
		return this;
		
	}
	@And("enter the password as {string}")
	public Login enterpswd(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
		
	}
	@And("click on login")
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
		
	}

}
