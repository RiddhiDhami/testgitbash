Feature: Test login functionality
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And User is on login page
    When User enters <username> and <password>
    And User clicks on login
    Then User is navigated to the home page
    Examples:
     | username | password |
     | standard_user | secret_sauce |
     | visual_user | secret_sauce |
     | problem_user | secret_sauce |
     | performance_glitch_user | secret_sauce |