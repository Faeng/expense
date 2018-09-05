Feature: spend money
    As a user
    I want to spend money and record to my expense account

Scenario: the balance will be correct when I spend money
    Given I spend money 500 baht
    When the balance is 1000 baht
    Then my balance is 500 baht

Scenario: the balance will be correct when I spend money twice
    Given I spend money 500 baht and I spend money 400 baht
    When the balance is 1900 baht
    Then my balance is 1000 baht

