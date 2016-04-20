@Order
Feature: Verify purchase

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

  @Current
  Scenario Outline: Purchase a yellow  dress with 20% off orignal price by selecting colour, quantity and size
    Given I open automationpractice website
    When I sign in
    And I select dress option as "<dress options>"
    And I select categories as  "<Categories>"
   # And I select size as "<Size>"
    #And I select colour as "<Colour>"
    And I select an item with 20% off the orignal price
    And I select quantity as "<Quantity>"
    And I verify details on shoppingCart and proceed to checkout
    And I verify details on the confirmation page and proceed to checkout
    And I verify address details and proceed
    And I verify payment details page and proceed
    And I verify order procedure page and proceed
    Then I verify order confirmation page details and verify success message
    And I sign out

    Examples: 
      | dress options | Categories | Colour | Quantity | Size |
      | Women         | Dresses    | Yellow | 1        | S    |
      #| Women         | Tops       | Black  | 1        | S    |
