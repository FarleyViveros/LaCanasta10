Feature: Editar Insumos
  Scenario: Editar un insumo existente
    Given un objeto insumo
    When se llama al método editarInsumos
    Then se actualiza el insumo
    And se retorna verdadero

  Scenario: Editar un insumo inexistente
    Given un objeto insumo
    When se llama al método editarInsumos
    Then se produce una excepción
    And se retorna falso