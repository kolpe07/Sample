Feature: Test the Orange HRM Application

  Scenario: Test Login Functionality
    Given user is on login page
    When user enter valid username and valid password

  Scenario: Test Home Page Functionality
    Then user is on home page and validate home page title
    And user validate home page URL

  Scenario: Test PIM Page add Employee Functionality
    When user click on pim link
    Then validate user is on pim page
    And click on add employee
    And user enter firstname middle and last name
    And click on save button
