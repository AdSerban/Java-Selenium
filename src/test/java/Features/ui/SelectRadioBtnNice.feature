Feature: Select Elegant

  Scenario Outline: Select Elegant of Radio Btn

    Given I enter the page
    Then I select option: <type> for me
    Examples:
    |  type  |
    |  Radio button 1  |
    |  Radio button 2  |
    |  Radio button 3  |

  #Scenario : Select Elegant of Radio Btn

    #Given I enter the page
    #Then I select option: Radio button 4 - disabled for me