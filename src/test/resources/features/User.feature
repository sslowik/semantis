Feature: Set user data

  As a user, I should be able to specify me contact details

  Scenario Outline: Set user contact details
    Given User is logged in
    When User sets the contact details
    Then User profile is updated

    Examples:
      | user_id | user_email         | user_phone |
      | 007     | james.bond@mi6.gov | 456123789  |
      | 008     | jan.fasola@mi6.gov | 123123321  |
