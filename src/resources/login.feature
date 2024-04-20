Feature: Login Functionality

  As user I want

  Scenario: User should login successfully
    Given I am on home page
    When I enter username and password
    And I click on login button
    Then I successfully login