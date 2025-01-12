3:00 to 3:45 ---> Basic Locators
3:45 to 4:00 --->  Breakout+Break
4:00 to 5:00 ---> Dropdown
5:00 to 5:20 ---> Breakout+Break
5:20 to 6:00 ---> Xpath
6:00 to 6:15 ---> Recap

Dropdown:
What is a Dropdown?

A dropdown in web development is a user interface element that allows users to select one option from a list of options.
In HTML, this is structured with a <select> tag as the parent element and <option> elements as children.
Selenium must be able to interact with these elements to test web applications thoroughly.
How to Handle Dropdown?

Selenium provides a Select class specifically for interacting with dropdown elements.
The Select class offers methods to select options within a dropdown easily.
When to Use?

The Select class should be used when an element in the DOM is identified with a <select> tag, indicating a dropdown menu.
<select> Structure in DOM

The <select> tag in the DOM represents the dropdown element,
and the nested <option> tags represent the individual choices available to the user.
How to Use Select Class?

To use the Select class, a Selenium script must first identify the <select> element in the DOM.
Then, an instance of the Select class is created by passing the located WebElement as an argument to its constructor.
This allows the script to manipulate the dropdown as needed.
Helper Methods

The Select class provides various methods to select options from a dropdown, such as:
selectByIndex(index): Selects an option by its index in the dropdown, starting with 0.
selectByVisibleText("text"): Selects an option by the text visible to the user in the dropdown.
selectByValue("value"): Selects an option by the value of its value attribute.

Definition and Structure:

Absolute XPath: It starts from the root (html) and traverses down to the desired element, detailing every single element in the hierarchy. The path starts with a single forward slash /, indicating the root. For example: /html/body/div[2]/div[2]/div/form/p[1]/input. `.
Relative XPath: It starts from anywhere within the document and typically focuses on identifying elements based on attributes, indexes, or specific tags, not necessarily detailing the entire path from the root. It starts with a double forward slash //, indicating the search can begin anywhere. For example: //input[@id=‘username’].
Robustness:

Absolute XPath: It is less robust because if there are any changes in the path or structure of the web page, the XPath would break, leading to failed element location.
Relative XPath: It is more robust as it usually focuses on specific attributes or elements, making it less susceptible to changes in the overall structure of the webpage.
Length and Complexity:

Absolute XPath: These tend to be longer . They map the entire path from the root to the element, making them more complex.
Relative XPath: They are generally shorter and more concise, targeting specific elements directly without detailing the entire path, reducing complexity.
Flexibility and Use Cases:

Absolute XPath: It's less commonly used in dynamic web environments where page structures can change frequently.
Relative XPath: More commonly used in web automation and scraping because of its adaptability to web page changes and ability to precisely target elements.
Performance:

Absolute XPath: It can be slower in performance as it requires traversing the entire hierarchy of the DOM (Document Object Model) from the root.
Relative XPath: Generally offers better performance as it allows for more direct queries and doesn't necessarily traverse from the root.
Relative Xpath:

a.Basic xpath

Attribute based xPath: Syntax: //tagname[@attributename='attributeValue'] 

Text based xPath: Syntax: //tagname[text()='textvalue'] 

Partial Attribute based xpath: Syntax: //tagname[contains(@attributename,'partialattributevalue')] 

Partial Text based xpath:
Syntax: //tagname[contains(text(),'partialtextvalue')]  

Index based xpath: Syntax: (//tagname[@attributename='attributeValue'])[2]
