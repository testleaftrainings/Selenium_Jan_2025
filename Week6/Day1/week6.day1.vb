3:00 to 3:30 ---> StaticParameterization
3:30 to 3:50 ---> Breakout+Break
3:50 to 4:20 ---> DynamicParameterization
4:20 to 4:50 ---> Breakout+Break
4:50 to 5:30 ---> TestNG attributes
5:30 to 6:00 ---> ScreenShot

Steps to implement Static Parameterization:
Identify the data that are common across all the testcases
Add parameter tag for each datas in the XML file ex:
Map the parameters in the class using @Parameters ex: @Parameters({"url","username","password"})
Note: The name should exactly match the names in the xml
Use that parameters inside the method using arguments Note: Sequence matters but the name of the arguments does not matter
Finally, replace the arguments with the hardcoded values
Note: You should always run from the xml file when you use parameters


Identify the data that are need to be dynamic for the particular testcase ex: CreateLead : companyName, firstName, lastName, phoneNumber EditLead : phoneNumber,companyName
Create a method sendData and annotate with @Dataprovider annotation and give a name for the DataProvider
Create an Input array with rowCount and columnCount - add datas into the array with index starting from 0
Return data back to the calling method
Receive the data in the testcase uding dataProvider attribute
Pass input arguments to the test method and replace all the hardcoded data

@BS

@BT

   @BC
    
     @DataProvider

       @BM
          
          @Test

       @AM

   @AC

@AT          
@AS

TestNG Attributes:
priority

Definition: This attribute sets the priority level for the methods; lower numbers indicate higher priority.
Use case: Used when you want to control the order of test method execution.
Syntax: @Test(priority=2)
enabled

Definition: This attribute determines whether a test method is enabled or disabled.
Use case: Used to enable or disable a test method without removing its code.
Syntax: @Test(enabled=false)
invocationCount

Definition: This attribute indicates how many times a test method should be invoked.
Use case: Used when you want to execute a test method multiple times for the same data.
Syntax: @Test(invocationCount=10)
threadPoolSize

Definition: The size of the thread pool for this method. The method will be invoked from multiple threads as specified by invocationCount. NOTE: this attribute is ignored if invocationCount is not specified
Use case: Used when you want to perform parallel execution of methods with invocationCount.
Syntax: @Test(invocationCount=10,threadPoolSize=5)
invocationTimeOut

Definition: The maximum number of milliseconds this test should take for the cumulated time of all the invocationcounts. This attribute will be ignored if invocationCount is not specified.
Use case: Used to limit the total time for repeated test method invocations.
Syntax: @Test(invocationTimeOut=10000)
dependsOnMethods

Definition: This attribute lists the methods a test method depends on.
Use case: Used when a test method depends on one or more methods and should only be run if the dependent methods pass.
Syntax: @Test(dependsOnMethods={"methodA", "methodB"})
alwaysRun

Definition: If set to true, this test method will always be run even if it depends on a method that failed.
Use case: Used to guarantee the execution of certain cleanup methods, regardless of test success or failure.
Syntax: @Test(alwaysRun=true)
timeOut

Definition: The maximum number of milliseconds this test should take.
Use case: Used to fail a test if it takes longer than a specified amount of time.
Syntax: @Test(timeOut=3000)
Dependencies with Annotations

You can use the attributes dependsOnMethods or dependsOnGroups, found on the @Test annotation. There are two kinds of dependencies:
Hard dependencies: All the methods you depend on must have run and succeeded for you to run. If at least one failure occurred in your dependencies, you will not be invoked and marked as a SKIP in the report.
Soft dependencies: You will always be run after the methods you depend on, even if some of them have failed. This is useful when you just want to make sure that your test methods are run in a certain order but their success doesn’t really depend on the success of others. A soft dependency is obtained by adding "alwaysRun=true" in your @Test annotation.




Frequently asked Interview Questions on Attributes
If a TestNG class contains multiple test methods without any specified priority or dependencies, in what order would you expect these methods to execute?

In TestNG, if test methods within a class are assigned priorities, how does this affect their execution order?

Consider a TestNG class with a mix of test methods where some have a specified priority and others don't. Explain the order in which these methods will execute.

What happens in TestNG when two test methods have the same priority value? How does TestNG decide which method to run first?

If test methods have a combination of priority and dependsOnMethods attributes. Explain the execution order of these methods and the reason behind it.