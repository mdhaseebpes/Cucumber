
Feature:  Accounts

  @prod
  Rule:This is a rule

  @smoke
  Scenario:  scenario 1
    Given  my account balance is $100
    When I withdraw $50
    Then the account balance should be $0

  @regression
  Scenario:  scenario 2
    Given  my account balance is $100
    When I withdraw $50
    Then the account balance should be $0

  @smoke
  Scenario Outline:  scenario 3
    Given  my account balance is $<opening balance>
    When I withdraw $<withdrawal amount>
    Then the account balance should be $<closing balance>
    @QA
    Examples:
    |opening balance | withdrawal amount | closing balance |
    | 100            | 50                 |50              |
    | 50             | 50                 |0               |

    @Stage
    Examples:
      |opening balance | withdrawal amount | closing balance |
      | 100            | 50                 |50              |
      | 50             | 50                 |0               |




