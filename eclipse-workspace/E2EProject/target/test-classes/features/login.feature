Feature: Login into Application

Scenario Outline: Postivie test validating login
Given Initialize the browser with chrome
And Navigate to "http://qaclickacademy.com" site
And Click on Login link in home page to land on sign in page
When User enter <username> and <password> and logins in
Then Verify that user is successfully login
And close browser

Examples:
|username                   |password          |
|test99@gmail.com           |123456            |
|test344@gmail.com          |94895940          |