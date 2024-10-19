Feature: A new user registration to OpenCart Website

  Registration of a new user

Scenario: Register a New user to Open Cart Website
  Given user hit the Open Cart Home page
  When user hover over the My account drop down and click on Register link
  And user enter "Abdul" as first name
  And user enter "Wahab" as lastname
  And user enter unique email
  And user enter "13439024335" as telephone
  And user enter "123456" as password and "123456" as confirm password
  And user check the checkbox Privacy Policy
  And user click on the Continue button
  Then A new user should be register successfully

