Feature: Add to cart

  @cartFeature
  Scenario: Add one quantity from store
    Given I'm on the Store page
    When  I add a "Blue shoes" to the cart
    Then I should see 1 "Blue shoes" in the cart