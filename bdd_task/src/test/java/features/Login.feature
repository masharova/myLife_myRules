Feature: Git Hub sign in

  Scenario: error message is displayed upon registration with invalid email pattern
    Given Github login page is opened
    When user enters “invalid” into email field
    Then red error sign inside the email field should be displayed
    And error message below email field should be displayed

  Scenario: message under password field indicates a completeness of password requirements
    Given Github login page is opened
    When user enters “AAA” into password field
    Then “at least fifteen characters” message should be marked red
    And “a lowercase letter” message should be marked red
    When user enters “AAAaaa” into password field again
    Then “at least fifteen characters” message should be marked red again
    And “a lowercase letter” message should be marked green

  Scenario: error message is displayed upon registration with already existent username
    Given Github login page is opened
    When user enters masharova already existent username into username field
    Then red error sign inside username field should be displayed
    And error message below username field should be displayed
    And suggested usernames in error message contains the username entered



