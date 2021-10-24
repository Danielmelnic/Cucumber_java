Feature: Task1

  Background:
    Given I am on the task1 page


  Scenario Outline: for error cases
    When I enter number "<number>" in the field
    And I click submit big button
    Then I see error message "<error>"
    Examples:
      | number | error                 |
      | 13     | Number is too small   |
      | 130    | Number is too big     |
      | good   | Please enter a number |

  Scenario Outline: for valid cases
    When I enter number "<number>" in the field
    And I click submit big button
    Then I see alert message containing "<result>"
    Examples:
      | number | result                    |
      | 60     | Square root of 60 is 7.75 |