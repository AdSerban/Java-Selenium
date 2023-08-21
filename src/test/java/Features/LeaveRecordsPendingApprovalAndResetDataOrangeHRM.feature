Feature: As a user I want to see leave records with Pending Approval status for an employee, and then reset the entered data

  Scenario Outline: Access Pending Approval and Reset Data
    Given I access OrangeHRM page - reset data
    When I enter valid login credentials - reset data
    And I press the Login button to log into my account - reset data
    And I click the Leave link from the menu - reset data
    And I select a period from "<from date>" to "<to date>"
    And I select to see only leave with Pending Approval status - reset data
    And I select Leave Type as CAN - Personal
    And I enter "<Anthony Nolan>" in the Employee Name field
    And I press the Search button
    And I click on the Reset button
    Then I should see a pop-up message that says no records found

    Examples:
    | from date  | to date    | Anthony Nolan |
    | 2021-12-01 | 2023-12-31 | Anthony Nolan |
