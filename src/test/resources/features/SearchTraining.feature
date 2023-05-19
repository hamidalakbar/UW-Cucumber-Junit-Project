@ui @regression
Feature: Search for training functionality
  Agile US: As a user, I should be able to enter data into "Search for training" search box

  Scenario: Verify user is able to enter data into "Search for training" box
    Given user is on "Research Administration Learning" web page
    Then user should be able to enter "text" into the "Search for training"
