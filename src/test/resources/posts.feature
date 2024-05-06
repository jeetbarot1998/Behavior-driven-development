Feature: Post feature of facebook
  This will test the post functionality at the user wall

  Background:
    Given The User should be logged in

  Scenario: Post a message on user wall
    Given I type the message as "My Post" in the text box
    When I type the message in the box
    And Clicks on Post button
    Then the message should be posted

#  Not Data table: For every iteration of the whole scenario, it will
#  use the following values from the data table.
#  Hence these all steps will be executed 2 times.
#  once with user1, pass123 and once with user2, pass456
  Scenario Outline: User logs in with valid credentials
    Given I am on the login page
    When I enter "<username>" and "<password>"
    Then I should be logged in successfully

    Examples:
      | username | password |
      | user1    | pass123  |
      | user2    | pass456  |


# Data table: Here a input values are applicable only for a certain step.
#  All 4 steps will not be executed. Only 'When' condition will be executed 3 times
  Scenario: User login scenario
    Given User is at login page of the app
    When When the user is giving the following credentials
      | username | password |
      | user1    | pass123  |
      | user2    | pass456  |
    Then user should be logged in successfully
