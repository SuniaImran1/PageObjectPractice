Feature: Verify Account page
@Current
  Scenario: 
    Given I open automationpractice website
    When I sign in
    And I verify that I land on the MY ACCOUNT page
    And I click on the ORDER HISTORY AND DETAILS button
    And I verify that I land on Order history page
    And I click on My account tab
    And I click on the MY CREDIT SLIPS button
    And I verify that I land on Order slip page
	    And I click on My account tab
    And I click on the MY ADDRESS button
    And I verify that I land on My ADDRESS page
    And I click on My account tab
    And I click on the MY WISHLIST button
    And I verify that I land on My WISHLIST page
    And I click on My account tab
