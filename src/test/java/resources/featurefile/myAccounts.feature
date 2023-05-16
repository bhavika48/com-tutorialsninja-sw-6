Feature: RegisterAccounts page
  As a user I want to register in mu account successfully
@@sanity @regression
  Scenario: Verify user should navigate To register page successfully
    Given I am on register page
    When  I click on My Account Link
    And I select Register link
    And I verify the text Register account

  Scenario: Verify user should navigate to Login page successfully
    When I click on my account link
    And I call the method "selectMyAccountOptions" method and pass the parameter  Login
    And I should verify the text returning Customer

  Scenario: Verify that user register account successfully
    When I click on my account link
    And  I Call the method "selectMyAccountOptions" method and pass the parameter Register
    And  I enter First Name
    And  I enter Last Name
    And  I enter Email
    And  I enter Telephone
    And  I enter password
    And  I enter password confirm
    And  I select subscribe Yes radio button
    And  I click on Privacy Policy check box
    And  I click on continue button
    And  I Verify the message "Your Account Has Been Created!"
    And  I click on Continue button
    And  I click on my Account Link
    And  I call the method "selectMyAccountOptions" method and pass the parameter Logout
    And  I verify the text Account Logout
    Then  I click on Continue button

  Scenario: Verify That User Should Login And Logout Successfully
    When I click on My Account Link
    And  I call the method "selectMyAccountOptions" method and pass the parameter Login
    And  I  enter Email address
    And  I  enter Last Name
    And  I  enter Password
    And  I click on Login button
    And  I  verify text My Account
    And  I  vlick on My Account Link
    And  I  call the method selectMyAccountOptions method and pass the parameter Logout
    And  I verify the text Account Logout
    Then I  click on Continue button
