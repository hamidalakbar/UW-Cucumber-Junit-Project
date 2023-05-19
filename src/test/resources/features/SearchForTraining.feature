@ui @regression
Feature: Search for training functionality

  Background: User is on "Research Administration Learning" page
    Given user is on "Research Administration Learning" web page

    # Agile US: As a user, I should be able to enter data into "Search for training" search box
  Scenario: Verify that user is able to enter data into "Search for training" box
    Then user should be able to enter "text" into the "Search for training"

    # Agile US: As a user, when I enter search criteria like case I should see following records given in screenshot
  Scenario: Verify that user sees given records after entering search criteria
    When user enters "case" search criteria
    Then user should see given records on web page
      | Case Studies in Effort Certification: Salary Cap and UW Faculty at the VA                       |
      | Compliance Case Studies: Financial Conflict of Interest, Export Controls and Research Integrity |
      | Compliance Case Studies: Human Subjects, Research Animals and Biological Substances             |
      | Non-Financial Compliance Basics                                                                 |
      | Subaward Fundamentals                                                                           |





