@Order
Feature: Verify purchase of one dress

  Scenario: order confirmation
    Given I open automationpractice website
    When I sign in
    And I select a dress
    And I select colour as "Orange"
    And I select size as "S"
    And I verify details on shoppingCart and proceed to checkout
    And I verify details on the confirmation page and proceed to checkout
    And I verify address details and proceed
    And I verify payment details page and proceed
    And I verify order procedure page and proceed
    Then I verify order confirmation page details and verify success message
    And I sign out

  Scenario Outline: Verify order details with chosen size and quantity
    Given I open automationpractice website
    When I sign in
    And I select a dress
    And I select colour as "<Colour>"
    And I select size as "<Size>"
    And I select quantity as "<Quantity>"
    And I verify details on shoppingCart and proceed to checkout
    And I verify details on the confirmation page and proceed to checkout
    And I verify address details and proceed
    And I verify payment details page and proceed
    And I verify order procedure page and proceed
    Then I verify order confirmation page details and verify success message
    And I sign out

    Examples: 
      | Colour | Size | Quantity |
      | Orange | S    | 2        |
      | Black  | M    | 2        |
      | Blue   | L    | 2        |
      | Yellow | S    | 4        |
    
      
