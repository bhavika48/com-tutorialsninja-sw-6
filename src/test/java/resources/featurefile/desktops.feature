Feature: Desktop Page
  As a user I want to verify products.
@sanity @regression
  Scenario: verify product arrange in alphaBatical order
    When I mouse hover on Desktops tab and click
    And  I  click on Show All Desktops
    And  I select Sort By position Name: Z to A
    Then I should Verify the Product will arrange in Descending order

  Scenario: Verify product added to shoppingCart successFully
    When I mouse hover on Desktops tab and click
    And  I click on Show All Desktops
    And  I select Sort By position Name: A to Z
    And I select product HP LP3065
    And I verify the Text HP LP3065
    And I select Delivery Date "2022-11-30"
    And  I enter Qty 1 using Select class
    And  I click on Add to Cart button
    And  I verify the Message Success: You have added HP LP3065 to your shopping cart!
    And  I click on link shopping cart display into success message
    And  I verify the text Shopping Cart
    And  I verify the Product name HP LP3065
    And  I verify the Delivery Date "2022-11-30"
    And  I verify the Model Product21
    Then I verify the Todat £74.73
