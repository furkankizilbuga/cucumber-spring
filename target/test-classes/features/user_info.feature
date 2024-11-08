Feature: User Info Test

  Scenario: Successful Login
    Given Username is 'validUsername' and password is 'validPassword'
    When User tries logging in
    Then User should see 'Welcome!' message

  Scenario: Unsuccessful Login with wrong password
    Given Username is 'validUsername' and password is 'wrongPassword'
    When User tries logging in
    Then User should see 'Check your credentials!' message

  Scenario: Unsuccessful Login with wrong username
    Given Username is 'wrongUsername' and password is 'validPassword'
    When User tries logging in
    Then User should see 'Check your credentials!' message