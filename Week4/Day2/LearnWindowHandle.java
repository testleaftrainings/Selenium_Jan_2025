package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//address of current window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);//A3C18ED70588E02302C9310E756BB27D
		//gettitle
		System.out.println(driver.getTitle());
		//get all the windows
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set<String> childWindow = driver.getWindowHandles();
		//convert set to list
		List<String> listWindow=new ArrayList<String>(childWindow);
		//navigate to child 
		driver.switchTo().window(listWindow.get(1));
		String windowHandle1 = driver.getWindowHandle();
		System.out.println(windowHandle1);
		System.out.println(driver.getTitle());
		
		//driver.close();
		driver.quit();
		//no such window exception--ther e is no window trying to handle it
		
		
		

	}

}
