package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass {
	@Test(dataProvider="fetchData")
	public  void runCreateLead(String company,String fName,String lName) {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyNam")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name="fetchData")
	public String[][] sendData() {
		//declare a 2D array
		//first[]--->represents no of rows
		//second[]-->no of columns
		
		String [][] data=new String[2][3];
		
		//assign the data foe 2D array
		//index starts from 0
		data[0][0]="Testleaf";
		data[0][1]="Saranya";
		data[0][2]="S";
		
		data[1][0]="Testleaf";
		data[1][1]="Subraja";
		data[1][2]="S";
		
		return data;
		
		
		
		
	}
}






