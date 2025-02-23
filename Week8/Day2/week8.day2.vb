Today's Agenda:
3:00 to 4:00 --->ExtentReport Integration
4:00 to 4:10 --->Break
4:10 to 5:30 --->Hybrid Framework
5:30 to 5:50 --->BreakOut
5:50 to 6:00 --->Recap

Steps to integrate ExtentReport:

1)Create startReport() in the BaseClass and declare the ExtentReport extent as a global variable
Add all the common lines of code (Step 1 - Step 3)
Annotate startReport() with @BeforeSuite
2)Create stopReport() in the BaseClass and have the code
extent.flush();
Annotate with @AfterSuite
3)Create testCaseDetails() in the BAseClass and have the lines of code to create testcase and assign the details
Annotate this method with @BeforeClass
4)Replace all the hardcoded datas with some global variables
Declare some global variables as public String testName, testDescription,testAuthor, testCategory;
5)Assign all the value inside setValues() in each testcase

@BeforeSuite---startReport()
  @BeforeTest--->setValues()
    @BeforeClass--->testCaseDetails()
     @DataProvider--->sendData()
      @BeforeMethod--->precondn()
       @test---->testcases
      @AfterMethod--->postcondn()
    @AfterClass---Nil
  @AfterTest---Nil
@AfterSuite---->stopReports()-

FrameWork:
Description:
1.Hybrid--->TestNg--->testcases execution,BDD-->cucumber(T.L.I)
--we use selenium webdriver as a tool to interact with web appln.
--designed framework is based on POM(design pattern)
--Apachepoi-To read the data from Excel
---AventStack-ExtentReports

Components: - com.framework.selenium.design - Browser It is an Interface which has all unimplemeneted methods related to browser - Element It is an Interface which has all unimplemented methods related to Element

  - com.framework.selenium.base
          - SeleniumBase
              It acts as the wrapper class(It has its own customized methods built on 
              top of Selenium library)
              It is the heart of our framework
              where proper exception handling is done
              It implements Browser and Element Interfaces
              It is a class which has all the reusable methods 
             
          - DriverInstance
               It is to maintain the driver instances specifically
               where it has all the configurations to avoid thread conflict between the driver access 

   - com.framework.testng.base
          - ProjectSpecificMethods
               This class has all the methods specific to the project            
          - RetryEngine
                This class is used to retry the failed tests automatedly 

   - com.framework.utils
         - DataLibrary 
              Read the data from th excel sheet
         - Reporter
              to deal with ExtentReport

   - com.framework.pages
         - It has classes for each page

   - com.framework.testcases     
         - It has classes for each testcase     
Hierarchy: AbstractTestNGCucumberTests DriverInstance Reporter SeleniumBase ProjectSpecificMethods pages testcases




STAR -> Situation Task Action Result

-------------------------------------------------------

Scenario1: Enhance framework with dynamic test data

Situation: We are using Excel to keep the data. Which is providing static data to the test cases. Client has raised this a concern as data whatever we create using automation looks like junk data in data base

Task: I was asked to implement dynamic data for the test cases

Action: I have explored APIs and libraries to dynamic data  and implemented faker one of the java library. Faker is very simple and easy to implement in our framework. 

Result: Data created using Faker is dynamic and looks like real data.
