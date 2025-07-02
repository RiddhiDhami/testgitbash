Feature: Login Action
  Scenario Outline: Successful Login with valid Credentials
    Given User is on Home page
    When User Navigate to Login Page
    And User enters "<Username>" and "<password>"
    Then Message displayed Login Successfully
    Examples:
      | Username | password |
      | standard_user | secret_sauce |
      | looked_out_user | secret_sauce |
      | problem_user | secret_sauce |
      | performance_glitch_user | secret_sauce |

