package week7.day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {

	public static void main(String[] args) throws IOException {
		
		//setup the report path
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
		
		//maintain history
		reporter.setAppendExisting(true);
		
		//use class ExtentReports
		ExtentReports extent=new ExtentReports();
		
		//attach the data with the file
		extent.attachReporter(reporter);
		
		//testcase details and assigning
		
		ExtentTest test=extent.createTest("login", "createlead with mandatory detail");
		
		//assign the testcategory
		test.addScreenCaptureFromPath("smoke");
		test.assignAuthor("saran");
		//attach the steplevel status
		test.pass("uname entered succesfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/homepage.png").build());
		test.pass("pwd entered sucessfully");
		test.pass("login is sucessfully done");
		//mandatory
		extent.flush();//reports will be saved in the reports folder
		
		System.out.println("done");
	}

}
