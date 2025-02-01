package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//locate the element
		WebElement scrollDown = driver.findElement(By.xpath("//span[contains(text(),'Amazon.com')]"));
		//instantiate the action class
		Actions act=new Actions(driver);
		//use the object to call the req methods
		act.scrollToElement(scrollDown).perform();//peRFORM is mandatory
		
		String text = scrollDown.getText();
		System.out.println(text);
		

	}

}
