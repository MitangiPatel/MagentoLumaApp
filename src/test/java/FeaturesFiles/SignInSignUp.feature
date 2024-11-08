#Testcase 1 : Create an Account for new User
Feature: To check Create an account and Sign in functionality with LUMA app

Scenario Outline: Create an Account
Given Launch browser and Navigate to url
Then Verify that home page is visible successfully
When Click on Create an Account button
Then Verify that Create Account page is visible successfully
When Enter "<firstName>" "<lastName>" "<email>" "<password>" and "<confirmPassword>" 
And Click on Create Account button
Then Verify message for account creation
And Verify the "<email>" address
And Close the browser
#Thank you for registering with Main Website Store.

Examples: 
|firstName 	|lastName |email							|password	|confirmPassword 	|
|John 			|Jose    	|johnJose17@gmail.com	|Test@134 |Test@134 			|	


#Testcase 2: Sign in into the App
Scenario Outline: Sign in into the App
Given Launch browser and Navigate to url
Then Verify that home page is visible successfully
When Click on Sign in button
Then Verify that Customer Login Page is visible successfully
When Enter "<email>" and "<password>"
And Click on Sign In button in login page
Then Verify that user is Sign in successfully.
And Close the browser

Examples: 
|email							|password	|
|johnJose7@gmail.com	|Test@134 |
