package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.Login;

public class RunCreateLead extends BaseClass{
	@Test
	public void runcreateLead() {
	
	Login lp=new Login(driver);
	
	lp.enterUname().enterpswd().clickLogin().clickCrmsfaLink().clickLeads().myLeads()
	.enterCompanyName().enterFirstName().enterLastName().clickSubmit().verifyLeads();
	
	}
	

}
