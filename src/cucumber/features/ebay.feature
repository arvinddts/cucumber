Feature: Title of your feature

  @ebay
  Scenario: check the motor contents
    Given Iam on home page
    When I navigate to motor page
    Then I check contents of the motor page
    And close the browser completly

  @ebay
  Scenario: check the fashion contents
    Given Iam on home page
    When I navigate to fashion page
    Then I check contents of the fashion page
    And close the browser completly

  @ebay
  Scenario: check the electronics contents
    Given Iam on home page
    When I navigate to electronics page
    Then I check contents of the electronics page
    And close the browser completly
