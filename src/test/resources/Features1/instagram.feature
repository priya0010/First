Feature: Validation of Login Page in Linkedin web Application

Scenario: LK01_Validation of Login Page with valid username and password
Given User launch Linkedin Web Application
When User enters valid username and password
     | bala          |
     | mani@gmail.com |
     | java           |
And User Clicks Login Button
Then User verify Home Page is displayed
