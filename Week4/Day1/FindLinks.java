package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//find th no of links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//find the size
		int size = allLinks.size();
		System.out.println(size);
		//retreive the single link
		WebElement names = allLinks.get(1);
		String text = names.getText();
		System.out.println(text);
		
		//declare a list
		List<String> list=new ArrayList<String>();
		for (WebElement each : allLinks) {
			String text2 = each.getText();
			//System.out.println(text2);
			list.add(text2);
			
		}
		System.out.println(list);
		
		
		
		

	}

}
