Feature: As a user I am able to access the Language Packages

  Scenario: Access Language Packages

    Given I access OrangeHRM page - Language Packages
    When I enter valid login credentials - Language Packages
    And I press the Login button to log into my account - Language Packages
    And I click the Admin link from the menu
    And I click on the Configuration dropdown menu button
    And I click on the Language Packages option
    And I click on the Translate button for Spanish - Español language package
    Then I should be redirected to the languageCustomization page
