Feature: Test gmail Login

  Scenario: check the facebook login with wrong credentials
    Given Iam on facebook login page
    When I insert wrong username and password
    Then I should see proper error message
    And close the browser
