package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public RemoteWebDriver driver;

	/*
	 * @BeforeSuite public void startReport() {
	 * System.out.println("report started"); }
	 * 
	 * @BeforeTest public void setValues() { System.out.println("values are set"); }
	 * 
	 * @BeforeClass public void assignTestCaseDetails() {
	 * System.out.println("testcase dteails are assigned"); }
	 */
	@Parameters({"browser","url","username","password"})//values should be same as that of the xml file
	@BeforeMethod
	public void preConditions(String browser,String url,String uName,String pWord) {
		//order shld be maintained that of parameters tag
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		} else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
	 
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(uName);
	driver.findElement(By.id("password")).sendKeys(pWord);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@AfterMethod
	public void postConditions() {
	driver.close();
	}
	/*
	 * @AfterSuite public void stopReport() {
	 * System.out.println("report is stopped"); }
	 */
	

}
