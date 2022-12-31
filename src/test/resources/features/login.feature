


Feature: Sauce Demo Test
  @wip
  Scenario: Login Test
    Given The user is on the login page
    When  The user enters "standard_user" and "secret_sauce"
    Then  The user should be able to login and see "PRODUCTS"
    And  The user sort the products "Price (high to low)"
    And The user clicks cheapest as "29.99" and second costliest as "9.99" products
    And The user clicks shopping cart