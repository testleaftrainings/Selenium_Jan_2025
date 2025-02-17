3:00 to 3:30 ---> Explicit Wait
3:30 to 4:10 ---> Exception Handling
4:10 to 4:40 ---> Constructor
4:40 to 4:50 ---> Break
4:50 to 5:30 --->POM Introduction
5:30 to 5:45 ---> Breakout
5:45 to 6:00 --->Recap

Implicit wait:
  - it is a global wait.
  -All the find element() and findelements() are affected by this.
  -after reaching the max.limit if the element is not found the F.E() returns no such element exception

Java wait:(thread.sleep)
  -will sleep for the entire time mentioned particularly for a single piece of code.
  -not recommended because it slows down the execution.

  Explicit wait:
    -is a conditional based wait
    -it waits for the element's behavior and it interacts
      visiblity of element
      invisiblity
      staleness exception
      aler tobe present
      elementToBeClickable


ExceptionHandling:
exception:Abnorml behaviour which stops the pgm execution
a)compile time(checked exceptions)--->by external factors(n/w error,i/oerrors) 
b)runtime(unchecked)--->during the execution of pgm

1)no suchelement exception
2)no such alert exception
3)null pointer
4)array index out of exception
5)stale element reference 

How to handle the exceptions:
----------------------------
-use try and catch block
-multiple catch blocks can be used.
-cannot use try or catch block separartely

Leaftaps appln:
--------------
 -Loginpage
   enter the uname
   -enter the pwd
   -click on Loginpage
-Welcomepage
   click on crmsfa link
-My HOMEPAGE
   Click on leads
-My leads
   click createlead
-CreateLeadpage
   enter the cmpny name
   enter the fileName
   enter the lname
   click on createlead
-Viewleads page

Steps to Implement POM:
Create a new Project and have all the dependencies inside the pom.xml
Create 3 packages inside src/main/java
base Create a ProjectSpecificMethods and create 2 methods preCondition() and postCondition() and annotate with @BeforeMethod and @AfterMethod Create static driver as a global variable
pages Create 6 classes for each page Each Classes inside pages package should extends ProjectSpecificMethods Create methods for each action inside each page Inside each method add return statement according to the page navigation if an action stays in the sama page -> return this if an action takes you to another page -> return new Page();
testcases
All classes inside the testcase package should extend ProjectSpecificMethods Create a class called RunLogin Create a method called runLogin and annotate with @Test Create object for LoginPage and call the method and execute
