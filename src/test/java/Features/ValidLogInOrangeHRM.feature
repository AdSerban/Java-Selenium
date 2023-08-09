Feature:

  Scenario: Successful Login with Valid Credentials

    Given I access OrangeHRM page
    When I enter valid login credentials
    And I press the Login button to log into my account
    Then I verify that I am logged into my account by checking that the username is displayed in the navigation bar in the right corner of the application