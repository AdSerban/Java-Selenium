Feature: Vacation leave records for a certain period

  Scenario:As a user I want to see all the vacation leave records for a certain period

    Given I access OrangeHRM page - Vacation leave records
    When I enter valid login credentials - Vacation leave records
    And I press the Login button to log into my account - Vacation leave records
    And I click the Leave link from the menu - Vacation leave records
    And I select a specific period for which I want to see the records
    And I select to see only leave with Pending Approval status
    And I set Leave Type as US - Vacation
    And I press search button
    Then I should see all the records with all the data entered
