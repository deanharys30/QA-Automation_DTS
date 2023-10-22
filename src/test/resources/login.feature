Feature: Login to Saucedemo

  Scenario: Successful login
    Given I am on the Saucedemo login page
    When I enter valid credentials
    And I click the login button
    Then I should be on the products page

  Scenario: Invalid login
    Given I am on the Saucedemo login page
    When I enter invalid credentials
    And I click the login button
    Then I should see an error message
