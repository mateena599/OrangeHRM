Feature: OrangeHRM Application LOgIn Fuctionality Testing
Scenario Outline: Validating OrangeHRM LogIn Functionality

Given open chrome browser and navigate to OrangeHRM Application
When User enters "<UserName>" and "<Password>" and click on logIn button
Then User should be able to login successfully to the application and close the browser

Examples: 

|UserName|Password|
|admin   |admin123|
|ad      |ad99    |
|admin   |admin123|
