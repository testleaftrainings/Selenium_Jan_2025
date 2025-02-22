package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeads extends BaseClass {
	
	public ViewLeads(ChromeDriver driver) {
		this.driver=driver;
	}

	public ViewLeads verifyLeads() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if (text.contains("saran")) {
			System.out.println("text matched");
			
		} else {
			System.out.println("text not matcheds");

		}
		return this;
	}

}
