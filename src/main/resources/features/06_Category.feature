@smoke
Feature: user can select different categories

  Background: user has account
    Given user had an actual account
    And open home page again

  Scenario: Guest user could select different Categories

    When user choose category
    Then user return to the category that choosen