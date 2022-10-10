@smoke
Feature: Reset Password Page

  Scenario: User could reset his password

    Given user had an actual account
    And user goes to home page

    When user pressed on Log-in link in the header
    And user click on forgot password
    And user enters email address in login page
    And user clicks on Recover button

    Then display message "Email with instructions has been sent to you."at the top