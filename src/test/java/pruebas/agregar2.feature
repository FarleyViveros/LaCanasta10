Feature: Agregar una mesa

  Scenario: Agregar una mesa válida
    Given que tengo una instancia de EntMesas
    When agrego la mesa a la base de datos
    Then la mesa se agrega correctamente

  Scenario: Agregar una mesa inválida
    Given que tengo una instancia de EntMesas inválida
    When intento agregar la mesa a la base de datos
    Then la mesa no se agrega y obtengo un error