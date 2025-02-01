package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingWithWebTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//locate the table
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody"));
		//row count
		List<WebElement> rowCount = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
		int size = rowCount.size();
		System.out.println(size);
		//column count
		List<WebElement> colCount = driver.findElements(By.xpath("(//table[@role='grid'])[2]/thead/tr/th"));
		int size2 = colCount.size();
		System.out.println(size2);
		//retreive a particular data
		String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[2]/td[3]")).getText();
		System.out.println(text);
		//entire row
		List<WebElement> singleRow = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr[2]"));
		
		  for (WebElement rowIter : singleRow) { System.out.println(rowIter.getText());
		  }
		  //allDatas
		  List<WebElement> allData = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr/td"));
		  for (WebElement iter : allData) {
			System.out.println(iter.getText());
		}
		  
		  //dynamic values
		  for (int i = 1; i <=rowCount.size(); i++) {
			  
			driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td"));
			System.out.println("----------------------------");
			
			for (int j = 1; j <= colCount.size(); j++) {
				WebElement dynaDatas = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(dynaDatas.getText());
			}
		}
		 
		
	}

}
