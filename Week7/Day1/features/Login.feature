Feature: Login functionality of leaftaps application

#Background:
#Given Launch the browser and load the url

@Smoke @regression @sanity 
Scenario: login with positive credentials

When   enter the username as 'demosalesmanager'
And  enter the password as 'crmsfa'
And click on login
Then homepage is displayed

@Regression
Scenario: login with negative credentials

When   enter the username as 'demosale'
And  enter the password as 'crmsfa'
And click on login
But Error msg is displayed