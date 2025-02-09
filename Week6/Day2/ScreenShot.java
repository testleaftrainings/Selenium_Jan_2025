package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//take a screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//locate the page
		File destination=new File("./snap/homepage.png");
		//connect source and destination
		FileUtils.copyFile(source, destination);
		
		WebElement textField = driver.findElement(By.id("twotabsearchtextbox"));
		File source1 = textField.getScreenshotAs(OutputType.FILE);
		File destination1=new File("./snap/textfield.png");
		FileUtils.copyFile(source1, destination1);
		
		

	}

}
