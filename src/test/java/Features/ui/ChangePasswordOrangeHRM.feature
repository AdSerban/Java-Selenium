Feature: As a user I am able to change my password

  Scenario: As a user I am able to change my password

    Given I access OrangeHRM page - Change password
    When I enter valid login credentials - Change password
    And I press the Login button to log into my account - Change password
    And I select the Change Password option from drop-down user profile menu
    And I enter the current password in the Current Password field
    And I enter in the Password field a new password
    And I confirm the new password
    And I press the Save button to update the password
    Then I should be able to see the confirmation message