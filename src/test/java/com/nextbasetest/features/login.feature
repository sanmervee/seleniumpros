# new feature
# Tags: optional

Feature: NextBase app login feature
  User story:
  The user should be able to login with correct credentials to the hr account

  Scenario: successful login as hr
    Given user is on the login page
    When user enters hr username
    And user enters hr password
    Then user should see the dashboard