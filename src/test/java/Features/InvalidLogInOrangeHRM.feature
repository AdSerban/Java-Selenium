Feature: Login Action

  Scenario: Successful Login with InValid Credentials

    When I enter invalid login credentials
    And I press the Login button to log into my account
    Then I verify that an appropriate message is displayed for invalid credentials