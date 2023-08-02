Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User Navigate to LogIn Page
    When User enters "Admin" and "admin123"
    Then Message displayed Login Successfully

  Scenario: Successful LogOut
    When User LogOut from the Application
    Then Message displayed LogOut Successfully
