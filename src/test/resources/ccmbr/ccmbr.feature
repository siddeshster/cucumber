# new feature
# Tags: optional
Feature: Login
@Regression
  Scenario Outline: Successfuk Login
  Given User Launch Browser
    When User Opens URL
    And user enters EmailID as <email> and Password as <password>
    And user Clicks on Login
    Then Page title should be  "My Account"
    Then Click on Logout
  Examples:
    | email | password |
    | s@d.com | admin    |
    | s@q.com | pass     |
    | s@d.com | admin    |
    | s@d.com | admin1    |
    | s@d.com | admin    |
    | s@d.com | admin2   |
