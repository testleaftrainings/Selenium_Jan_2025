package hooksimplementation;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepdefinition.BaseClass;

public class Hooks {
	public ChromeDriver driver;
	@Before
	public void preCondn() {
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	@After
	public void postCondn() {
		driver.close();
	}

}
