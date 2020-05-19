Feature: Functionality of Radio Button
  Scenario Outline: User can check only one option
    Given User enter the page and see three options to choose
    When User click on option <option 1>
    Then <option 2> should not be selected
    And <option 3> should not be selected
    And User is able to close browser
    Examples:
      | option 1 | option 2 | option 3 |
      | "Option 1" | "Option 2"| "Option 3" |
      | "Option 2" | "Option 1" | "Option 3" |
      | "Option 3" | "Option 1" | "Option 2" |

