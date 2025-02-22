package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests{
	
	private static final ThreadLocal<ChromeDriver> cDriver=new ThreadLocal<ChromeDriver>();
	
	public void setDriver() {
		cDriver.set(new ChromeDriver());
	}
	
	public ChromeDriver getDriver() {
		return cDriver.get();
	}
	@BeforeMethod
	public void precondn() {
		setDriver();//driver is initialized
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterMethod
	public void postCondn() {
		getDriver().close();
	}

}
