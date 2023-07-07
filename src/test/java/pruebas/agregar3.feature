Feature: Agregar Insumos

  Scenario: Agregar un nuevo insumo
    Given que tengo un objeto de tipo EntInsumos
    When llamo al método agregarInsumos
    Then el insumo se agrega correctamente