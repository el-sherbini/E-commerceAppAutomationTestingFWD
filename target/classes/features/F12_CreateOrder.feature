Feature: User could create successful Order

  Scenario: User create successful Order
    Given user navigates to login page
    And user enters email "mEmad@gmail.com" and password "123456"
    And user click on login button
    When user add a product
    And user accept the terms of service
    And user click on checkout button
    And user fill the billing address data
    And user continue with default values
    And user confirm the order
    Then user create a successful order