package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public ChromeDriver driver;
	@BeforeSuite
	public void startReport() {
		System.out.println("report started");
	}
	@BeforeTest
	public void setValues() {
		System.out.println("values are set");
	}
	@BeforeClass
	public void assignTestCaseDetails() {
		System.out.println("testcase dteails are assigned");
	}
	@BeforeMethod
	public void preConditions() {
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@AfterMethod
	public void postConditions() {
	driver.close();
	}
	@AfterSuite
	public void stopReport() {
		System.out.println("report is stopped");
	}
	

}
