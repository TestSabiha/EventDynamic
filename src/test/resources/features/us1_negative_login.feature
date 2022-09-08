@regression @smoke
@negative_login
Feature: US_01 As a user, I should not  be able to log in with invalid credential.

  Scenario: Verify user login fail with invalid credentials
    Given user on the home page
    When user click AppLogin button
    And user click log in button
    And user enter  Email "String"
    And user enter Password "String"
    And user click Continue button
    Then user verify the error message
