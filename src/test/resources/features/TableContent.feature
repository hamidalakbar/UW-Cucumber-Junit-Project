@ui @regression
Feature: Content table functionality

  Background: User is on "Research Administration Learning" page
    Given user is on "Research Administration Learning" web page

  Scenario: Verify that 45 records are shown with no search criteria
    When no search criteria is entered
    Then user sees 45 records on the web page

  Scenario: Verify that grid have data in columns: Name, LifeCycle, Type, Length
    Then columns Name, LifeCycle, Type, Length have data
