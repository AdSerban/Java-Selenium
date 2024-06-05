Feature: As a user I want to display all the leave records in Rejected status

#  Background:
#    Given I access OrangeHRM page
#    When I enter valid login credentials
#    And I press the Login button to log into my account

  Scenario: Display all the leave records in Rejected status

    Given I access OrangeHRM page - Display Records
    When I enter valid login credentials - Display Records
    And I press the Login button to log into my account - Display Records
    And I click the Leave link from the menu - Display Records
    And I click on the Leave List option
    And I select Rejected status by filtering from Show Leave section
    Then I check that the Rejected status is present as a selection - Display Records
#
#  Scenario: As a user I am able to schedule an interview with a candidate
#
#    And I click on the Recruitment link from the menu which will redirect me to the viewCandidates page
#    And I click on the view icon located in the Actions section to see a candidate's application in Status Shortlisted
#    And I click the Schedule Interview button for that candidate
#    And I add the title of the interview
#    And I add two interviewers in the Interviewer field
#    And I select a date and hour
#    And I press the Save button to schedule the interview
#    Then I should see the confirmation message for this scheduled interview