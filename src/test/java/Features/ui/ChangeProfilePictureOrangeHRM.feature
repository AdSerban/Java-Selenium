Feature: As a user I can change my profile picture
  Scenario: As a user I can change my profile picture

    Given I access OrangeHRM page - profile picture
    When I enter valid login credentials - profile picture
    And I press the Login button to log into my account - profile picture
    And I click on the My Info link on the menu which will redirect me to the PersonalDetails page
    And I click on the profile picture
    And I add a picture
    And I click the Save button
    Then I can see that my profile picture has been updated