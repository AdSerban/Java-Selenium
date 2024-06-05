Feature: As a user I can see all the Automation Tester vacancies
  Scenario: As a user I can see all the Automation Tester vacancies

    Given I access OrangeHRM page - Vacancies

    When I enter valid login credentials - Vacancies

    And I press the Login button to log into my account - Vacancies

    And I click on the Recruitment option from the menu

    And I click on the Vacancies option

    And I search for vacancies with job title as Account Assistant

    Then I can see that all records are displayed for Account Assistant

