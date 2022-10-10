
@smoke
Feature: user should be able to login to the system



  Scenario: user login with valid username and password
    Given  user had an actual account
    And user goes to home page
    When user pressed on Log-in link in the header
  And user enters email address in login page
  And user enters password
  And user pressed on Log-in button

    Then user could login successfully
    And user pressed on Log-out link





  Scenario: user login with invalid username and password

    Given  user goes to home page
    And user pressed on Log-in link in the header
    And user enters invalid email address in login page
    And user enters password
    And  user pressed on Log-in button

    Then user could not login successfully


