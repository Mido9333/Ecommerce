@smoke
Feature: Switch between currencies

  Background: user has account
    Given user had an actual account
    And open home page again

  Scenario: User could switch between currencies US & Euro

    When user choose from currency list

    Then verification from currency