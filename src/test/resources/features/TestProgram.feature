Feature: Test Program

  Scenario Outline: Run app
    Given Insert the username, password and Login page
    And Add new user with <nameFull>
    And Edit one user with username
    And Delete one user
    Then Back to home page
    Examples:
      | nameFull |
      | Andrei Ion |
