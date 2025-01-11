Today's Agenda:
---------------

3:00 to 4:00 ---> Methods & Objects
4:00 to 4:20 --->  Breakout+Break
4:20 to 5:00 ---> Selenium Introduction
5:00 to 5:10 ---> Launch Browser
5:10 to 5:30 ---> Breakout+Break
5:30 to 6:00 ---> Basic Locators




Methods:
Definition: A method in Java is a set of instructions or a block of code encapsulated within a named unit. 
It is designed to perform a specific task and can be invoked (called) from other parts of the program. Methods promote code reusability, modularization, and a more organized code structure. 
They are defined by the method's signature, which includes its name, parameters, and return type.
Explanation: Declaration: Methods are declared with a return type, a name, and parameters (if any). Return Type: Specifies the type of data the method will return, or "void" if it doesn't return anything. Parameters: Input values passed to the method for processing.

Objects:
Definition: In Java, an object is an instance of a class, representing a real-world entity or concept. Objects encapsulate data (attributes) and behavior (methods) related to the entity they represent. They are created from class blueprints and follow the principles of object-oriented programming (OOP), including encapsulation, inheritance, and polymorphism. Objects interact with each other through method calls and can store and manipulate data.
Explanation
Instantiation: Objects are created from classes using the new keyword. Attributes (Fields): Define the properties of an object. Behaviors (Methods): Define the actions an object can perform.

Selenium Introduction:
What is Selenium?-
-----------------
Selenium is a powerful tool used for automating web browsers.
It can interact with web pages, simulating actions that a human would do, like clicking buttons, entering text, and navigating through websites.
Testers use Selenium to test their web applications, ensuring that they work as expected across different browsers and environments.
Why Selenium?

The reason Selenium is so popular is because it's open-source, which means it's free to use and has a large community of users contributing to its development.
This tool supports multiple programming languages like Java, Python, and C#, allowing a wide range of developers to use it.
Additionally, Selenium can work with various browsers such as Chrome, Firefox, and Safari, making it versatile.
Its ability to automate repetitive tasks not only saves time but also improves the accuracy of testing, as it removes the likelihood of human error.

When to Use Selenium?
---------------------
Selenium is ideal for testing web applications.
If you have a website or a web application that needs to be tested across different browsers and operating systems, Selenium is a great choice.
It's especially useful for regression testing, where you need to repeatedly test the same application following changes or updates.
It's also used for creating robust, browser-based regression automation suites and tests, and for scaling and distributing scripts across different environments.
Tool Usage Across the World

Globally, Selenium leads in usage and downloads, indicating its widespread acceptance and reliability in the field of web automation.
Playwright and Cypress, while also popular, follow Selenium in terms of the user base and application in various industries.
Tool - Scripting Languages

A significant advantage of Selenium is its support for multiple scripting languages like Java, Python, C#, and others, offering flexibility to and testers.
In contrast, Playwright and Cypress are more focused on JavaScript, catering to a specific segment of developers.

How Selenium Emerged?
---------------------
The development of Selenium began at Thoughtworks in 2004, evolving from a simple internal tool to a comprehensive testing framework.
Over the years, it expanded from Selenium Core to include RC, IDE, and WebDriver, each addressing specific testing needs and overcoming the limitations of its predecessors.
Selenium Components:
--------------------
The Selenium suite comprises various components like WebDriver, RC, IDE, Grid, and its different versions. - Each component serves a specific purpose, from direct browser automation (WebDriver) to parallel test execution (Grid), making Selenium a versatile tool for diverse testing requirements.
What Selenium Can and Cannot Do?
-------------------------------
While Selenium excels in automating browser interactions and supporting cross-platform testing, it has limitations.
It cannot directly interact with databases or automate non-web applications. For such tasks, additional tools or frameworks are often required to complement Selenium's capabilities.
How Selenium Talks to Browsers:
------------------------------
Selenium communicates with browsers through language-specific bindings and browser drivers.
These drivers act as intermediaries, translating commands written in programming languages like Java or Python into actions that the browser can perform.
This communication is standardized through the W3C WebDriver protocol, ensuring consistency and compatibility across different web browsers.

Selenium interaction:
---------------------
How Communication Happens?
Selenium automations are performed using the WebDriver, which is an interface that sends commands to a browser and retrieves results.
The process is streamlined through WebDriver's ability to communicate across various browsers using the same script in a chosen programming language.

Why Selenium Communicates with Webpage Through HTML Document-DOM?

Understanding the Document Object Model (DOM), which is the logical structure of HTML documents, allows Selenium to interact with various elements on a webpage.
By communicating through the DOM, Selenium can simulate user actions like clicking and typing in a way that mirrors real user behavior.

What is DOM?

The DOM is a representation of a browser’s current web document.
It's a hierarchical tree of objects that enables scripts to dynamically access and update the content, structure, and style of documents.
Understanding the DOM is crucial for locating elements to interact with during testing.
Understanding HTML Structure and Tags

The HTML structure is composed of various tags like <html>, <a>, <button>, <div>, <iframe>, <img>, <input>, <option>, <select>, <span>, and <table>.
Each tag has a specific purpose, such as defining hyperlinks, sections in a document, or input fields. Knowing these tags helps in identifying elements for Selenium to interact with.

To Locate Element in DOM:
-------------------------
Different locators such as id, name, className, linkText, partialLinkText, xpath are used to find elements in the DOM.
Each locator has a specific use case, for example, id is used when the element has a unique identifier, while xpath are used when elements are dynamic or duplicate name, class, or ID.
How to Use Locators?

Locators are used with the Syntax:
---------------------------------
`driver.findElement(By.locator("value"))` 
For instance, By.id("login") would locate an element with the ID of 'login'.

When to/Not to Use Locators:
---------------------------

Guidelines are provided on when to use specific locators.
For example, id should be used when it's available,
name if id does not exist,
linkText for links,
className when the class attribute is unique,
tagName for collections,
xpath if no other locator works.

