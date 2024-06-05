Feature: Delete Record

  Scenario: As a user I am able to delete record from my Contact Details

    Given I access OrangeHRM page - Contact Details
    When I enter valid login credentials - Contact Details
    And I press the Login button to log into my account - Contact Details
    And I click the My Info option from the menu - Contact Details
    And I select the Contact Details link which will redirect me to the contactDetails page
    And I tick the checkbox to select one record saved in the Records Found section
    And I press the Delete button to delete that record
    And I press Yes to confirm this deletion
    Then I should receive a confirmation message that the record has been deleted successfully