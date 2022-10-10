@smoke
Feature: user could add different products to Compare list

  Background: user has account
    Given user had an actual account
    And open home page again

  Scenario: user could add different products to Compare list
    Given user adds First Product to CompareList
    And user adds Second Product to CompareList
    And user adds Third Product to CompareList

    When user goes to Compare Products

    Then user compares between the choosen products
    And user clears a product from compareList
    And user deletes all the Products choosen