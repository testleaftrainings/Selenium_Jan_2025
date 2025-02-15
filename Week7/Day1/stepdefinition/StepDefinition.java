package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooksimplementation.Hooks;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("Launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
		 driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	    
	}

	@When("enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	    
	}

	@When("enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	    
	}

	@When("click on login")
	public void click_on_login() {
		driver.findElement(By.className("decorativeSubmit")).click();
	    
	}
	
	

	@Then("homepage is displayed")
	public void homepage_is_displayed() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("home page is displayed");
			
		} else {
			System.out.println("homepage is not displayed");

		}
	    
	}
	@But("Error msg is displayed")
	public void errorMsg() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		if (text.contains("Errors")) {
			System.out.println("error msg is displayed");
			
		} else {
			System.out.println("error msg is not displayed");

		}
		
	}


}
