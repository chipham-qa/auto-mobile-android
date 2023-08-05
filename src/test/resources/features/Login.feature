Feature: Login

  @OpenApp
  Scenario: First time user experience
    Given App installed successfully
    When User launch the app for the first time
    Then They should be able to see the "Login" screen

  @InvalidLogin
  Scenario: Authentication
    Given invalid credential
    When user input invalid credential "demo@gmail.com" and "demo"
    Then error message must be visible "The password does not meet the password policy requirements. Check the minimum password length, password complexity and password history requirements."

