@test
  Feature: Scenario Outline Examples

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

  Scenario: Test Scenario print user info
    Given user navigates to website
    When I enter correct "firstname" and "lastname" with "<age>"
    Then user info should be printed
      |firstname|ferhat|
      |lastname|password1|
      |age|30|


    Scenario: Successful Login with Valid Credentials
      Given User is on Home Page
      When User Navigate to LogIn Page
      And User enters Credentials to LogIn
        | Username   | Password |
        | testuser_1 | Test@153 |
        | testuser_2 | Test@153 |
        | testuser_3 | Test@153 |
        | testuser_4 | Test@153 |
      Then Message displayed Login Successfully

