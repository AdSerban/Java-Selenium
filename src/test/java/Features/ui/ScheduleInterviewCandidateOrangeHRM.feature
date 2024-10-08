Feature: As a user I am able to schedule an interview with a candidate

  Scenario: As a user I am able to schedule an interview with a candidate

    Given I access OrangeHRM page - interview

    When I enter valid login credentials - interview

    And I press the Login button to log into my account - interview

    And I click on the Recruitment link from the menu which will redirect me to the viewCandidates page

    And I click on the view icon located in the Actions section to see a candidate's application in Status Shortlisted

    And I click the Schedule Interview button for that candidate

    And I add the title of the interview

    And I add two interviewers in the Interviewer field

    And I select a date and hour

    And I press the Save button to schedule the interview

    Then I should see the confirmation message for this scheduled interview