Feature: Facebook Registration

  Scenario: new facebook user registration
    Given Iam on facebook home page
    When I give user registration details
      | Fields       | values              |
      | firstname    | Arvind              |
      | lastname     | Kumar               |
      | email        | arvinddts@gmail.com |
      | reenteremail | arvinddts@gmail.com |
      | password     | abcd1234            |
      | sex          |                   0 |
      | date         |                   1 |
      | month        | Nov                 |
      | year         |                2000 |
    Then I should see error message user already exist
    
