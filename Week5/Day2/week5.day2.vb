3:00 to 3:45 ---> TestNG Basics
3:45 to 4:00 ---> Breakout
4:00 to 5:00 ---> sequential and parallel execution
5:00 to 5:30 ---> Breakout+Break
5:20 to 6:00 ---> TestNG Annotatins and attributes

software required TestNG frameork:
1)TestNg plugins
2)TestNg dependencies


Steps to start with TestNG:
Convert main method to a normal method -> remove static keyword -> remove arguments(String[] args) -> Give meaningful name for the method i.e -> replace main with runCreateLead
Add @Test on top of the method import @Test from org.testng.annotations
Right click and run as 1 TestNG Test
Steps to do Sequential Execution:
Select the required testcases and click TestNG -> Convert to TestNG -> A testng.xml wizard will appear
If you want give suite name, test name and click finish
A testng.xml file will appear inside your project
Double click and open the xml file Note : By default Design tab will be selected -> Select the source tab in the bottom
Run the suite file as Run As -> TestNG Suite
testng.xml
Location -> path of testng.xml
-> Represents a test suite
Contains on eor more
- Represents a testcase / group of testcases -> contains one or more classes contains one or more REpresents the java classes which contains test method verbose - It is an attribute to get the failure logs in the console
Parallel execution:
Select the required testcases and create a testng_parallel.xml
Open the xml file and add the attribute parallel ="classes"in the to run classes in parallel
Use the attribute thread-count to control the number of instances to be opened in parallel
To run mutiple tests in parallel add parallel="tests" in
Finally run the xml file
Basic Reports :
 index.html , emailable-report.html
After each execution -> Right click and refresh the project -> test-ouput folder -> index.html -> right click and open with system editor
TestNG Annotations Hierarchy:
@BeforeSuite--->begining of project

    @BeforeTest--->set the test level informations

        @Beforeclass--->set testcasename/author/category

           @BeforeMethod ---->preconditions
        
                @Test---->testcase

            @AfterMethod---->postcondition

        @AfterClass

    @AfterTest

@AfterSuite    


