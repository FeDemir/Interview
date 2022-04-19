Feature: API Tests
  Scenario: Get request to /users
    Given existing server application "https://reqres.in/api"
    Then GET request to "/users" it return expected users list

  Scenario: Get request to single user
    Given existing server application "https://reqres.in/api"
    Then GET request to "/users/2" it returns expected welcome message

  Scenario: GET request to nonexistent user
    Given existing server application "https://reqres.in/api"
    Then on GET request to "/users/23" it returns 404 status code

  Scenario Outline: POST request adds new user to users list
    Given existing server application "https://reqres.in/api"
    When POST new registration "<email>" and "<password>" to "/register"
    Then endpoint returns expected "<status>" and "<id>" and "<token>"
    Examples:
      | email                        | password      | status   | id   | token                |
      | "michael.lawson@reqres.in"   | "password123" | "200"    | "7"  | "QpwL5tke4Pnpja7X7"  |
      | "lindsay.ferguson@reqres.in" | "password123" | "200"    | "8"  | "QpwL5tke4Pnpja7X8"  |