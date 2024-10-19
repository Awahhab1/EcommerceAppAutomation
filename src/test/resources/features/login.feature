Feature: Login Functionality for Open Cart E-Commerce Website
  User want to be able to login with account credentials


  Scenario: Login to Open Cart Website
  Given user hit the Open Cart Home page
  When user hover over the My account drop down and click on login link
  And user enter "test99@test.com" as Email address
  And user enter "123456" as password
  And user click on the login button
  Then user should redirect to Account page






