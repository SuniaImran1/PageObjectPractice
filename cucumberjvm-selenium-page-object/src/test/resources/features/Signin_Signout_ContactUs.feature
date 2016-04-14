Feature: Verify process of signing in and signing out and the contact us actions

  Scenario: Sign in and sign out
    When I open automationpractice website
    And I sign in
    Then I sign out

  @Current
  Scenario: Contact Us Action
    When I open automationpractice website
    Then I perform contact us actions
