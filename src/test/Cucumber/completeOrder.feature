@Order
Feature: order

  Scenario: order confirmation
    When I open automationpractice website
    And I sign in
    And I select a dress and add to cart
    And I verify details on shoppingCart and proceed to checkout
    And I verify details on the confirmation page and proceed to checkout
    And I verify address details and proceed
    And I verify payment details page and proceed
    And I verify order procedure page and proceed
    Then I verify order confirmation page details and verify success message
