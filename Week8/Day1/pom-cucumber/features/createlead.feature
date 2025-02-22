Feature: Createlead functionality of leaftaps application

#Background:
#Given Launch the browser and load the url


Scenario Outline: createlead with multiple data

When   enter the username as 'demosalesmanager'
And  enter the password as 'crmsfa'
And click on login
When click on crmsfa link
And click on leads link
And click on createleads link
And enter the company name as <company name>
And enter  the firstname as <firstname>
And enter the lastname as <lastname>
When click on the leads submit button
Then viewLeadPage is displayed

Examples:
|company name|firstname|lastname|
|testleaf|saranya|S|
|qeagle|subraja|S|
