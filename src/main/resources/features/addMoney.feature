Feature: add money
    As a user
    I want to add money to the income account
    so that I can do transactions

Scenario: add money to account
    Given I add 200 baht to the account
    When the balance is 0 baht
    Then my balance is 200 baht

Scenario: add money to account twice
    Given I add 200 baht and I add 300 baht to the account
    When the balance is 0 baht
    Then my balance is 500 baht
