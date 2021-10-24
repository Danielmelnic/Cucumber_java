Feature: Task2, "People with Jobs" page

  Background:
    Given I am on People with Jobs page

  @Scen1
  Scenario Outline: Add a new person
    When I click add person
    And I adding person with "<name>" and "<job>"
    And I click add button

    Examples:
      | name   | job       |
      | Viktor | Driver    |
      | Jane   | Filmmaker |
      | Robert | Driver    |

  @Scen2
  Scenario Outline: Edit a person
    When I am on People with Jobs page
    And I click on edit button behind person
    And I enter new "<name>" and "<job>" for person
    Then I click on edit person button

    Examples:
      | name  | job          |
      | Julia | Photographer |

  @Scen3
  Scenario: Remove a person
    Then I want to remove a person


  @Scen4
  Scenario: Check that clear button on adding a user works correctly
    When I click add person
    And I click on Clear all fields button
