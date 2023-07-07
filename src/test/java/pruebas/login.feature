Feature: Login
  Scenario: Valid login
    Given un usuario con email "luis@hotmail.com" y password "102031"
    When el usuario intenta logearse
    Then el login debe ser exitoso

  Scenario: Invalid login
    Given un usuario con email "invalid@example.com" y password "wrongpassword"
    When el usuario intenta logearse
    Then el login debe fallar