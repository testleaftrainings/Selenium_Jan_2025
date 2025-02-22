package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Login;

public class RunCreateLead extends BaseClass{
	@BeforeTest
	public void setValues() {
		excelFileName="CreateLead";
		
	}
	@Test(dataProvider="fetchData")
	public void runcreateLead(String uName,String pwd,String cName,String fName,String lName) {
	
	Login lp=new Login(driver);
	
	lp.enterUname(uName).enterpswd(pwd).clickLogin().clickCrmsfaLink().clickLeads().myLeads()
	.enterCompanyName(cName).enterFirstName(fName).enterLastName(lName).clickSubmit().verifyLeads();
	
	}
	

}
