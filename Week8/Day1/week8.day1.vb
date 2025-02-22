3:00 to 3:45 ---> Sequential & parallel execution
3:45 to 4:00 ---> BreakOut
4:00 to 4:40 ---> POM with Cucumber
4:40 to 4:50 ---> Break
4:50 to 5:30 --->ThreadLocalImplementation
5:30 to 5:50 --->ExtentReports
5:50 to 6:00 --->Recap

For Sequential Execution:
---------------------------
- Driver declaration should be static
- Create 2 testcases inside testcases package
     runLogin
     runCreateLead
- Select the required testcases and convert into testng.xml file
- Finally, run the testcases together sequentially from testng.xml file

For Parallel Execution:
-----------------------
    - Remove static keyword in BaseClass
    - Create parameterized constructor in each pages
       public LoginPage(ChromeDriver driver) {
        //this keyword-used in variable level
        this.driver- its coming from PSM or BaseClass
        driver- local variable
	        this.driver=driver;
         }
    - Pass driver value in each Constructor initialization in each pages and testcases
return new HomePage(driver);

//if static removed from driver -null pointer 
//i am having static keyword i cannot perform parallel
 Create parameterized constructor in each pages
       public LoginPage(ChromeDriver driver) {
        //this keyword-used in variable level
        this.driver- its coming from PSM
        driver- local variable
	        this.driver=driver;
         }

         its possible  to run both seq and parallel


POM with Excel Integration:
---------------------------
Create data folder and have the excelsheets inside Login 
Create a package called utils and have the ReadExcel java class inside
Create sendData() and annotate with DataProvider and call the readExcel() and return
Replace all the hardcoded data with input arguments in the required pages
In the testClasses, use dataProvider attribute to receive the data and pass input arguments in the test method.
Create setValues() in each testclass to mention the fileName and annotate with @BeforeTest

How to Parameterize the data?
	  1)Create a new package(utils) and copy the ReadExel class from the previous project or package 
	  and paste it here
	  2)Create a data folder and create excel sheets
	  3)Declare the filedata globally in baseclass
	  4)Create a method for @DataProvider and call the ReadExel class
	  5)Integrate @Test with dataProvider attribute
	  6)Pass the inputs as arguments in the testcase method level and replace the hardcoded values
	  7)In the testcase create a method to mention the ExcelFileName and annotate with @BeforeTest

      Cucumber with POM:
      ------------------
 - Create 4 packages
     - base
        Create BaseClass with common methods
        BaseClass should extend AbstractTestNGCucumberTests
     - features
         Create feature files
     - pages
        Create classes for each page and each page should extend BaseClass
     - runner
        Create CucumberRunner class and , mention glue="pages"
        The runner class should extend BaseClass

Pom-ThreadLocal:
---------------
private-a variable which is accessible only within that class
static-one instance will be shared among all the classes
final-variable once initialized cannot be changed.
Steps: 1. private static final ThreadLocal<RemoteWebDriver> cDriver = new ThreadLocal<RemoteWebDriver>();

 private:
   It can be accessed only within the class
 static final:
    static+final = constant
 ThreadLocal:
   It is a class that provides thread-local variable

2. Use setter and getter methods
     Sets the current thread's copy of this thread-local variable

      public void setDriver() {
	cDriver.set(new ChromeDriver());

}
 Returns the value in the current thread's copy of this thread-local variable   
public RemoteWebDriver getDriver() {
	return cDriver.get();
}

@BeforeMethod
public void precondition(){
  setDriver();
  then replace driver variable into getDriver()
  getDriver().manage.window.max();
}

For TestNG _POM : - with driver as static -> sequential execution is possible
 - To have sequential and parallel execution declare Parameterized Constructor in each pages

For Cucumber_POM: 
- Constructor should not be defined 
- With driver as static 
-> sequential execution is possible


ExtentReports:
-Extenthtmlreporter
-ExtentReports
-MediaEntityBuilder
