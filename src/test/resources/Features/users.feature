@api
  Feature: Users POJO Example
    Scenario: User gets all users from json example
      Given User sends get request to "pojo.url"
      Then User confirms status code is 200
      Then User gets all users as a list
      And User confirms list size bigger than 5


    Scenario Outline: User gets first user's info
      Given User sends get request to "pojo.url" with end point "5"
      Then User confirms status code is 200
      Then User gets first user as person class
      And User confirms data matches with data below
      |id         |5                |
      |name       |Chelsey Dietrich |
      |username   |Kamren           |
      |email      |Lucio_Hettinger@annie.ca|
      |street     |Skiles Walks            |
      |suite      |Suite 351               |
      |city       |Roscoeview              |
      |zipcode    |33263                   |
      |phone      |(254)954-1289           |
      |website    |demarco.info            |
      |cName      |Keebler LLC             |
      |catchPhrase|User-centric fault-tolerant solution|
      |bs         |revolutionize end-to-end systems    |
      Then user enters "<username>" and "<password>"

      Examples:
        | username  | password |
        |user       |pass      | 