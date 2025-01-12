package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		
		/**
		 * steps to interact with the webelement
		 * 1)locate the element(find the element in the dom)
		 * 2)to locate the element--->findelement
		 * 3)to type in input field--->sendkeys
		 * 4)to store in a local variable---->ctrl+2,L
		 * 5)clicking--->click
		 */
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the username
		/*
		 * WebElement uName = driver.findElement(By.id("usernam"));
		 * uName.sendKeys("demosalesmanager");
		 */
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/p[1]/input")).sendKeys("demosalesmanager");
		//Enter the password
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
	}

}
