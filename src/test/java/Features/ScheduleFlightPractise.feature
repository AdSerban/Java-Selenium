Feature: As a user I want to schedule a flight for more passengers

  Scenario: As a user I want to schedule a flight for more passengers

    Given I access Practise page

    When I select AED from currency button

    And I add at least five passengers

    And I click on Done button to save the change

    And I click on Departure City option

    And I select BLR destination

    And I select MAA destination from Arrival City

    And I select a date for flight

    And I search after Ind in searching area

    And I select India from the Dynamic Dropdown

    And I select Senior Citizen option and assert that is selected

    And I select One Way radio button

    Then I should see that the Return Date is disabled

    And I click Search Button