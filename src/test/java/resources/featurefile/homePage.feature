Feature:Homepage
  As a user I want to verify navigate to pages.
@smoke @regression
  Scenario: Verify user should navigate to Desktops page successfully
  Give User is on Homepage
    When I mouse hover on Desktops tab and click
    And  I call selectMenu method and pass the menu = "Show All Desktops"
    Then I Should verify the text Desktops

  Scenario: verify user should navigate to LaptopsAndNotebooks page successfully
    When I mouse hover on Laptops & Notebooks Tab and click
    And  I call selectMenu method and pass the menu = "Show All Laptops & Notebooks"
    And  I verify the text Laptops & Notebooks
    And  I verify the text Laptops & Notebooks
    Then I verify the text Laptops & Notebooks

