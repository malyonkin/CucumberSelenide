Feature: Login User
  Здесь должно быть описание к этому сценарию

  Scenario: Login user
#    Given today is Sunday
#    When I ask whether it's Friday yet
#    Then Click "Log In" button

    Then Input login
    Then Input password
    Then Click "submit" button
    Then Subscription message "profile" visible