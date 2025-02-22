package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.Login;
import pages.WelcomePage;

public class RunLogin extends BaseClass{
	@Test
	public void runLogin() {
		System.out.println(driver);
		
		Login lp=new Login(driver);
		lp.enterUname().enterpswd().clickLogin().clickCrmsfaLink();
		
	}

}
