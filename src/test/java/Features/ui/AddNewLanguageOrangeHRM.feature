Feature: Add a new language Package

  Scenario: As a user I am able to add a new language Package

    Given I access OrangeHRM page - add new language
    When I enter valid login credentials - add new language
    And I press the Login button to log into my account - add new language
    And I click the Admin link from the menu which will redirect me to the viewSystemUsers page
    And I press on the Configuration drop-down menu button
    And I click on the Language Packages option - add new language
    And I click the Add button to add a new language to the packages
    And I select the language Colognian Germany from that list
    And I press the Save to add this new language to my packages
    Then I should be able to see the confirmation message that the language was successfully saved