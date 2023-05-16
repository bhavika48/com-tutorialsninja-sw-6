Feature: LaptopAndNotebooks Page
  As a user I want to verify products added successfully to the cart
@regression
  Scenario: verify products price display High To Low successfully
    When I mouse hover on Laptops & Notebooks Tab and click
    And I click on Show All Laptops & Notebooks
    And I select sort By "Price (High > Low)"
    And IVerify the product price will arrange in High to Low order

  Scenario: verify that user place order successfully
    When I mouse hover on Laptops & Notebooks tab and click
    And I click on Show All Laptops & Notebooks
    And I  select Sort By Price (High > Low)
    And I  select Product MacBook
    And I  verify the text MacBook
    And I  click on Add To Cart button
    And I  verify the message Success: You have added MacBook to your shopping cart!
    And I  click on link shopping cart display into success message
    And I verify the text "Shopping Cart"
    And I  verify the Product name MacBook
    And I change Quantity "2"
    And I click on Update tab
    And I  verify the message Success: You have modified your shopping cart!
    And I  verify the total "£737.45"
    And I  click on checkout button
    And I verify the text Checkout
    And I verify the text New Customer
    And I click on guest Checkout radio button
    And I click on Continue tab
    And I  fill the mandatory fields
    And I click on continue Button
    And I  add Comments about your order into text area
    And I  check the Terms & Conditions check box
    And I click on Continue button
    Then I should verify the message Warning: Payment method required!