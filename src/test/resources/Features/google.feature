@ui
Feature: Google Search Tests
  Scenario: Search a term in google
    Given User goes to "google.url"
    Then User searches "Horses"
    Then User confirms count on founds is greater than 100