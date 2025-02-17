package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class Login extends BaseClass {
	
	
	public Login enterUname() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		/*
		 * Login lp=new Login(); return lp;
		 */		
		return this;
		
	}
	public Login enterpswd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
		
	}
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
		
	}

}
