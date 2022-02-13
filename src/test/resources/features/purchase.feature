#"test" right click-new-directory
Feature: Adidas order placement functionalities
  Agile Story: As a user, I should be able to place order from Website so that I can shop online
@wip
  Scenario: Placing a successful order
    Given User is on the home page
    When User adds "Sony vaio i5" from "Laptops"
    And User adds "Dell i7 8gb" from "Laptops"
#Given:precondition  When:actions with quation mark to parameterize