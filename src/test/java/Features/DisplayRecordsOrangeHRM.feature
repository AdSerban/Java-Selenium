Feature: As a user I want to display all the leave records in Rejected status

  Scenario: Display all the leave records in Rejected status

    Given I access OrangeHRM page - Display Records
    When I enter valid login credentials - Display Records
    And I press the Login button to log into my account - Display Records
    And I click the Leave link from the menu - Display Records
    And I click on the Leave List option
    And I select Rejected status by filtering from Show Leave section
    Then I check that the Rejected status is present as a selection - Display Records