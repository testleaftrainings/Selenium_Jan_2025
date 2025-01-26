package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch the parent frame
		WebElement nestedFrame = driver.findElement(By.xpath(" //h5[contains(text(),' Click Me (Inside Nested frame)')]/following::iframe"));
		driver.switchTo().frame(nestedFrame);
		//switch to child frame
		driver.switchTo().frame(1);
		//click
		driver.findElement(By.id("Click")).click();
		driver.switchTo().parentFrame();//parent frame will take  to the immediate frame
		//default content--->it will switch back to the main content
	}

}
