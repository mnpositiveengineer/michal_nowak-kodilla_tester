Feature: Is it Summer?
  Everybody likes Summer

  Scenario Outline: Last Day of Summer is Summer
    Given today is <day>
    When I ask whether it's Summer
    Then I should be told <answer>
    Examples:
      |  day | answer |
      | last day of Spring | "Nope" |
      | first day of Autumn | "Nope" |
      | first day of Summer | "Yes"  |
      | last day of Summer | "Yes"  |

