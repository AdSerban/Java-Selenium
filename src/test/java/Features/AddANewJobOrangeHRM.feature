Feature: As a user I want to add a new job

  Scenario: As a user I want to add a new job

    Given I access OrangeHRM page - add new job
    When I enter valid login credentials - add new job
    And I press the Login button to log into my account - add new job
    And I click the Admin link on the menu
    And I select the Job Titles option from the Job menu dropdown
    And I click the Add button to add a new job
    And I add a name for the job in the Job Title field
    And I add a job description
    And I add a Job Specification file
    And I click the Save button to add the new job
    Then I should see the confirmation message that the job was successfully added