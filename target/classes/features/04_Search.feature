@smoke
Feature: user can search for any product

  Background: user has account
    Given user had an actual account
    And open home page again

  Scenario: User can search for any product by name
    # Search Using Name
    When user clicks on search box
    And write "Lenovo" in the search box
    And user clicks on search button

    Then find all related products

  Scenario: Guest User could search for any product using SKU
    # Search Steps Using SKU
    When user clicks on search box
    And write "AP_MBP_13" in the search box
    And user clicks on search button

    Then user will find "Apple MacBook Pro 13-inch"