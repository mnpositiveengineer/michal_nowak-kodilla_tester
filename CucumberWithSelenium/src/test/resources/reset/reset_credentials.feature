Feature: Reset functionality on login page of Application
  Scenario Outline: Verification of Reset button
    Given Open the Firefox and launch the application
    When Enter the <Username> and <Password>
    And Clicking on Reset button
    Then UserID should be empty
    And Password should be empty
    Examples:
      | Username | Password |
      | "username11" | "password12" |
      | "username12" | "password12" |
      | "username13" | "password13" |
      | "username14" | "password14" |
      | "username15" | "password15" |
      | "username16" | "password16" |