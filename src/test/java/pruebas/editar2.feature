Feature: Editar Mesas
  Scenario: Editar una mesa existente
    Given un objeto mesa
    When se llama al método editarMesa
    Then se actualiza la mesa
    And se retorna correcto

  Scenario: Editar una mesa inexistente
    Given un objeto mesa
    When se llama al método editarMesa
    And se retorna incorrecto