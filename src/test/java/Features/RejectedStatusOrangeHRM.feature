Feature: Rejected Status

  Scenario: Login on OrangeHRM and check the rejected status

    Given I access OrangeHRM page A
    When I enter valid login credentials A
    And I press the Login button to log into my account A
    And I click the Leave link from the menu
    And I select the Rejected status from the Show Leave with Status section
    Then I check that the Rejected status is present as a selection by using XPath selector