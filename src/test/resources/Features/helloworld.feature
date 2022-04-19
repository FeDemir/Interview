@api
  Feature:wiremock
    Scenario: Get response from wiremock
      Given User sends get request to "helloworld.url"
      Then User verifies that payload has "Hello World!"

