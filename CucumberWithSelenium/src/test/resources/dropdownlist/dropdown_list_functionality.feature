Feature: Dropdown List with months on Facebook web page
  Scenario Outline: Verify if all months are visible on dropdown list
    Given user enter facebook web page
    And dropdown list with months should be visible
    When selecting dropdown list
    Then month such as <month> should be visible
    And user should be able to choose <month> without any issue
    And quit the browser successfully
    Examples:
      | month |
      | "sty" |
      | "lut" |
      | "mar" |
      | "kwi" |
      | "maj" |
      | "cze" |
      | "lip" |
      | "sie" |
      | "wrz" |
      | "paź" |
      | "lis" |
      | "gru" |