
  Feature:  Make a purchase of two products
  Given enter the page: www.saucedemo.com
  When purchase items
@Scenario1sauceglobal
  Scenario: Add two items to the shopping cart
    Given that a customer accesses the shopping website
    When you add products to the cart
    Then he sees the products listed in the shopping cart
@Scenario2sauceglobal
  Scenario Outline: Add items to shopping cart
    Given that a customer accesses the shopping website
    When he adds products to the cart
      | <ProductName> | <quantityAdd> |
    Then he sees the products listed in the shopping cart.

  Examples:
    | ProductName | quantityAdd |
    | Backpack    | 1           |
    | t-shirt     | 1           |