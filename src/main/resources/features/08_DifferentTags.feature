@smoke
Feature: user could select different tags

  Background: user has account
    Given user had an actual account
    And open home page again

  Scenario: user could select different tags
    When user choose Category then hover to open sub-Category
    And user choose a popular tag
    And user will find products

    Then user choose a different tag
    And user will find different products