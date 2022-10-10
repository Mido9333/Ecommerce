@smoke
Feature: Shopping Cart

  Background: user has account
    Given user had an actual account
    And open home page again

  Scenario: User click on ADD TO CART button after choosing a product
    When user scrolls down to products
    And user chooses product randomly
    And click on ADD TO CART button

    Then the product is added to the user's shopping cart and message appears says The product has been added to your shopping cart