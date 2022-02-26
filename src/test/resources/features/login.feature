Feature: login feature

  @regression
  Scenario: login with valid credentials
    Given login with credentials
    When navigate the home page
    Then verify home page
    When Add 1 product to cart
    When Add 2 products to cart

  @smoke
  Scenario: login with invalid credentials
    Given login with invalid credentials
    Then verify the error in login screen


  @regression1
  Scenario Outline: Product page
    Given login with credentials
    When navigate the home page
    Then verify home page
    When Add 1 "<productName>" product to cart product
    When Add 2 "<productName>" stores to cart product
    @stage
    Examples:
    |productName|
    |  GreenShoes |

    @prod
    Examples:
      |productName|
      |  GreenShoes |


  @regression1
  Scenario Outline: Store page
    Given login with credentials
    When navigate the home page
    Then verify home page
    When Add 1 "<productName>" to cart
    Examples:
      |productName|
      |  Reebok   |
