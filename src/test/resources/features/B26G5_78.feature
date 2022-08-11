@wip
Feature: Creating new Vehicle Service Log functionality

  Scenario: As the truck driver, the user should create new Vehicle Service Log
    Given the user log in to home page
    When the user clicks on Vehicle Service Log
    And the user creates new Vehicle Service Log
    Then then user should see the new created Vehicle Service Log in the table