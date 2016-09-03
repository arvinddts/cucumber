Feature: Titles of ebay pages

  Scenario Outline: scenario_table check the page contents
    Given st Iam on home page
    When st I navigate to <link> page
    Then st I check contents of the <title> page

    Examples: 
      | link        | title       |
      | Motors      | Motors      |
      | Fashion     | Fashion     |
      | Electronics | Electronics |
