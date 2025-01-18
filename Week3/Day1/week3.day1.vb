3:00 to 3:45 ---> Arrays
3:45 to 4:05 --->  Breakout+Break
4:05 to 5:00 ---> Strings
5:00 to 5:20 ---> Breakout+Break
5:20 to 5:50 ---> Advanced xpath
5:50 to 6:00 ---> Recap

Arrays:
 An array in Java is a data structure that allows you to store multiple values of
 the same data type under a single variable name. Arrays provide a way to efficiently
 manage and access a collection of elements of the same type. Each element in an 
 array is identified by an index, starting from 0 for the first element.

 Example: int[] myArray = {1, 2, 3, 4, 5};

array will be work on index value -start from '0'

cha[] data ={'a','d','g','c','e','s'}
starting index -0
ending index -5

Advanced X-path:

Parent to Child: Syntax: BasicRelativeXpathforParent/childTagname Example: (//form[@id='login']/p)[2] 

Child to Parent: Syntax:  BasicRelativeXpathforChild/parent::parenttagname Example:  //label[text()='Password']/parent::p //p[@class='top']/parent::form

GrandParent to GrandChild: Syntax: BasicRelativeXpathforGrandParent//grandchildTagname Example: (//form[@id='login']//input)[3] 

GrandChild to GrandParent: Syntax:  BasicRelativeXpathforGrandChild/ancestor::Grandparenttagname
Example: //input[@class='decorativeSubmit']/ancestor::form

ElderCousin to YoungerCousin: Syntax: BasicRelativeXpathforElderCousin/following::youngerCousintagname
Example: `//span[text()='Company Name']/following::input

YoungerCousin to ElderCousin: Syntax: BasicRelativeXpathforYoungerCousin/preceding::ElderCousintagname
Example: //input[@id='createLeadForm_firstName']/preceding::input[2] 

ElderSibling to YoungerSibling: Syntax:
BasicRelativeXpathforElderSibling/following-sibling::youngerSiblingtagname Example: //label[text()='Username']/following-sibling::input

YoungerSibling to ElderSibling: Syntax: BasicRelativeXpathforYoungerSibling/preceding-sibling::ElderSiblingtagname Example:
//input[@id='username']/preceding-sibling::label
`