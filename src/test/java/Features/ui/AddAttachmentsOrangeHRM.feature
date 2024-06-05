Feature: Add Attachment

  Scenario: As a user I am able to add an attachment into my Contact Details

    Given I access OrangeHRM page - attachment
    When I enter valid login credentials - attachment
    And I press the Login button to log into my account - attachment
    And I click the My Info option on the menu
    And I click on the Contact Details link which will redirect me to the contactDetails page - attachment
    And I click the Add Attachments button
    And I select to upload a file
    And I add a comment for this document uploaded in the comment field
    And I press the Save button for this attachment added
    Then I am able to see my document added in the record found section by using css selector