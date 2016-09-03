Feature: Titles of ebay pages

  Scenario: check the motor contents
    Given parameter Iam on home page
    When parameter I navigate to "Motors" page
    Then parameter I check contents of the "Motors" page

  Scenario: check the fashion contents
    Given parameter Iam on home page
    When parameter I navigate to "Fashion" page
    Then parameter I check contents of the "Fashion" page

  Scenario: check the electronics contents
    Given parameter Iam on home page
    When parameter I navigate to "Electronics" page
    Then parameter I check contents of the "Electronics" page
