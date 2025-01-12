package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		/**
		 * steps to handle the dropdown
		 * 1)identify the element whether it is present inside the <select tag>
		 * 2)if the DD is inside the <select>then 
		 * locate the element and store in the local variable.
		 * 3)use the select class and create an object pass the webelement 
		 * inside the constructor
		 * 4)using the select class objects can access the methods,3 methods
		 * a)select by visible text
		 * 2)select by index
		 * 3)select by value
		 * 
		 * 
		 */
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the username
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("demosalesmanager");
		//Enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on the leads
		driver.findElement(By.linkText("Leads")).click();
		//click on the create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//enter the firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		//enter the lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		//click the source dropdown
		WebElement sourceDd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(sourceDd);
		//select as employee
		sel.selectByIndex(4);
		//click the industry
		  WebElement indDd = driver.findElement(By.id("createLeadForm_industryEnumId"));
		  Select sel2=new Select(indDd);
		  //sel2.selectByValue("IND_FINANCE");
		  sel2.selectByVisibleText("Distribution");
		
		
	}

}
