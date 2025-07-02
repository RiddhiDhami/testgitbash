Feature: User login feature
  Scenario: User login scenario
    Given User is at the login page of the application
    When User log in wth following username and password
    | user1 | paas1 |
    | user2 | pass2 |
    | user3 | pass3 |
    Then user should be able to login with correct username and password