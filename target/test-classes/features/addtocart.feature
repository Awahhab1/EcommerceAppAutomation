Feature: Add to Cart Functionality for Open Cart E-Commerce Website
  User want to add products to cart


  Scenario: User Add product to the cart
    Given user hit the Open Cart Home page
    When user hover over the My account drop down and click on login link
    And user enter "test99@test.com" as Email address
    And user enter "123456" as password
    And user click on the login button
    And user click on the home page
    And user select some products from the Featured section
    Then Product added Successfully message should shown to user







  Scenario: Remove the user from the cart
  Given user hit the Open Cart Home page
  When user hover over the My account drop down and click on login link
  And user enter "test99@test.com" as Email address
  And user enter "123456" as password
  And user click on the login button
  And user click on cart and view cart link
  And user click on delete button
  Then The product should be deleted from the cart