Feature: Test Different Scenarios
  Scenario: Test Scenario username and password
    Given user navigates to website
    When I enter correct "username" and "password"
    Then login should be successful

  Scenario Outline: Test Scenario Usernames
    Given user navigates to website
    When I enter correct "<username>"
    Then login should be successful
    Examples:
      |username|
      |username1|
      |username2|
      |username3|
      |username4|
      |username5|

  Scenario Outline: Test Scenario Usernames  and passwords
    Given user navigates to website
    When I enter correct "<username>"
    And I enter correct "<password>"
    Then login should be successful
    Examples:
      |username|password|
      |username1|password1|
      |username2|password2|
      |username3|password3|
      |username4|password4|
      |username5|password5|

  Scenario Outline: Test Scenario Usernames  and passwords
    Given user navigates to website
    When I enter correct "<username>" and "<password>" with 10
    Then login should be successful
    Examples:
      |username|password|
      |username1|password1|
      |username2|password2|
      |username3|password3|
      |username4|password4|
      |username5|password5|
