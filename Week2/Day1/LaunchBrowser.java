package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//launch the browser
		//chromedriver---->chromebrowser
		//edgedriver----->edge browser
		
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver1=new EdgeDriver();//ctrl+shoft+o---->shortcut for importing
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		//get the title
		String title = driver.getTitle();
		System.out.println(title);
		//close the Browser
		driver.close();
		

	}

}
