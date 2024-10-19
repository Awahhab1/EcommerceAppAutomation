Feature: Home Page Module
  In order to test Home Page of application
  As a Registered user
  I want to specify the features of home page


Scenario: user redirect to Registration page from home page
  Given user hit the Open Cart Home page
  When user hover over the My account drop down and click on Register link
  Then user redirect to Registration page

Scenario: user redirect to Login page from home page
  Given user hit the Open Cart Home page
  When user hover over the My account drop down and click on login link
  Then user redirect to login page