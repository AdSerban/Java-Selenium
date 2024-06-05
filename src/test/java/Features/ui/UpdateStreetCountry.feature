Feature: Update Street and Country

  Scenario: Update Street and Country

    Given I access OrangeHRM page
    When I enter valid login credentials
    And I press the Login button to log into my account
    And I click the My Info option from the menu
    And I click on the Contact Details link which will redirect me to the contactDetails page
    And I update the Street one field from contact details
    And I select Algeria as country
    And I press the Save button
    Then I should see the successfully updated confirmation message