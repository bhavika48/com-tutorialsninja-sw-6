Feature: Component Page
  As a user I want to verify  component page navigation.
@smoke
  Scenario: verify user should navigate to Components Page successfully
    When I mouse hover on Components Tab and click
    And  I call selectMenu method and pass the menu = Show All Components
    Then I verify the text Components