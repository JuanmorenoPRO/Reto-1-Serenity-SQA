Feature: Create a user and  account in gurubank
  A new user want to create a new account

  Scenario: Create new user
    Given A user is in the gurubank page
    And Login in  gurubank
    And Select new user
    When Fill all requested fields
    Then the user should see the text "Customer Registered Successfully!!!"
    And Create a new account
    Then The user should see the text


