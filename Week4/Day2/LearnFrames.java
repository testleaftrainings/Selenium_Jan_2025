package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		/*
		 * check1--->element location
		 * check2--->wait
		 * check--->element is in frame----->No such element exception
		 * 2)No such frame exception-->
		 */
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch over frame
		driver.switchTo().frame(0);//index starts from 0
		
		driver.findElement(By.id("Click")).click();

	}

}
