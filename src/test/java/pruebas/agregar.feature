Feature: Agregar una carta

  Scenario: Agregar una carta válida
    Given una carta con nombre "Carta1", precio "10.99" y estado "1"
    When se agrega la carta
    Then la carta se agrega correctamente

  Scenario: Intentar agregar una carta inválida
    Given una carta con nombre "", precio "10.99" y estado "2"
    When se agrega la carta
    Then la carta no se agrega y se muestra un mensaje de error