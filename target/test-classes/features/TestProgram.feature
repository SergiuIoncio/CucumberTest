Feature: Test Program

  Scenario Outline: Run app
    Given Insert the username, password and Login page
    And Add new user with fullname as "<name>"
    And Edit one user with username
    And Delete one user
    Then Back to home page

    Examples: |name|
              |test|
