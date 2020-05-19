Feature: Cash Withdrawal
Scenario Outline: Successful payment and withdrawal
Given I have deposited <amount1> in my wallet
When I request <amount2>
Then <amount2> should be dispensed
And the balance of my wallet should be <amount3>
Examples:
| amount1 | amount2 | amount3 |
        | 100 | 50 | 50 |
        | 1000 | 1000 | 0 |

        Scenario Outline: Unsuccessful payment and withdrawal
Given I have deposited <amount1> in my wallet, which is not enough
When I try to withdraw <amount2>
Then the balance of my wallet should remain <amount1>
Examples:
| amount1 | amount2 |
        | 100 | 150 |
        | 1000 | 1001 |

        Scenario Outline: Unsuccessful payment
Given I have an account
When I want to deposit <amount1>
        Then The message Deposit should be more than zero should appear
Examples:
| amount1 |
        | 0 |
        | -10 |


        Scenario Outline: User checks the balance of an account in credit
Given my account has been credited with <amount>
        When I check my balance
Then I should see that my balance is <amount>
Examples:
| amount |
        | 1 |
        | 10 |
        | 1000 |