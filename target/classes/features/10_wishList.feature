@smoke
Feature: Add products to wishlist

  Background: user has account
    Given user had an actual account
    And open home page again

  Scenario: user add products to wishlist
    Given user scrolls down to products

    When user clicks add to wishlist

    Then user chooses attributes for product
    And product added and user can find it
    And open home page again
    And user adds another product to the Wishlist
    And user navigates to his Wishlist page