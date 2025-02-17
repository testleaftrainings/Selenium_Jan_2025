package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptionHandling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//instatntiate the webdriverwait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//use the condns
		WebElement clickEle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
		clickEle.click();
		
		WebElement visiblity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		boolean displayed = visiblity.isDisplayed();
		System.out.println(displayed);
		
		//invisiblity
		
		WebElement secEle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[2]")));
		secEle.click();
		
		Boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		System.out.println(invisible);
		
		
	}

}
