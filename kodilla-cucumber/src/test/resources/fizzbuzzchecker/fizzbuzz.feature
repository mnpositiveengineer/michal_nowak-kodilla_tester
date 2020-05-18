Feature: Fizz Buzz Checker

  Scenario Outline: Check if Fizz, Buzz or FizzBuzz is thrown correctly
    Given The number is <number>
    When Fizz when divisible by three, Buzz when divisible by five, FizzBuzz when divisible by three and five, None when non divisible by three or five
    Then The answer is <answer>
    Examples:
      | number | answer |
      | -9 | "Fizz" |
      | -6 | "Fizz" |
      | -3 | "Fizz" |
      | 3 | "Fizz" |
      | 6 | "Fizz" |
      | 9 | "Fizz" |
      | -20 | "Buzz" |
      | -10 | "Buzz" |
      | -5 | "Buzz" |
      | 5 | "Buzz" |
      | 10 | "Buzz" |
      | 20 | "Buzz" |
      | -45 | "FizzBuzz" |
      | -30 | "FizzBuzz" |
      | -15 | "FizzBuzz" |
      | 0 | "FizzBuzz" |
      | 15 | "FizzBuzz" |
      | 30 | "FizzBuzz" |
      | 45 | "FizzBuzz" |
      | -11 | "None" |
      | -7 | "None" |
      | -4 | "None" |
      | 1 | "None" |
      | 4 | "None" |
      | 11 | "None" |