@wip
Feature: Login Page


  Scenario Outline: Login with different accounts <userType>
      Given the user logged in as "<userType>"
    Examples:
    | userType |
    | HR       |
#    | Helpdesk |
#    | Marketing|


  Scenario Outline: User should not be able to login with <Invalid_userType>
    But the user can not logged in as "<Invalid_userType>"
    Examples:
      | Invalid_userType |
      | invalid          |
      |                  |