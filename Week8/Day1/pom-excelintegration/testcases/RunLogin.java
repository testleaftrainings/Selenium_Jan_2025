package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Login;
import pages.WelcomePage;

public class RunLogin extends BaseClass{
	
	@BeforeTest
	public void setValues() {
		excelFileName="login";
		
	}
	@Test(dataProvider="fetchData")
	public void runLogin(String uName,String pwd) {
		System.out.println(driver);
		
		Login lp=new Login(driver);
		lp.enterUname(uName).enterpswd(pwd).clickLogin().clickCrmsfaLink();
		
	}

}
