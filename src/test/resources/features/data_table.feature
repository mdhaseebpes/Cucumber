Feature:  Data tables

  @data
  Scenario: Data scenario
    Given  my credentials1
    | abo|abo123|
    | aboADMIN|aboADMIN123|


  @data
  Scenario: customer scenario
    Given  my customer data
      | abo|abo123|
      | aboADMIN|aboADMIN123|

  @data
  Scenario: multiple row with headers
    Given  my customers
      | username|password|
      | aboADMIN|aboADMIN123|
      | ADMIN|ADMIN123|


  @data
  Scenario: Data table transpose
    Given  my customers transpose
      | aboADMIN|
   |aboADMIN123|

  Scenario: MULTIPLE COLUMNS WITH HEADER
    Given MULTIPLE COLUMNS WITH HEADER
      | username | john    | bill    |
      | password | john123 | bill123 |


