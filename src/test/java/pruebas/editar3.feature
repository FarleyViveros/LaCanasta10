Feature: Editar detalle de solicitud

  Scenario: Editar detalle de solicitud existente
    Given que tengo una solicitud de detalle existente
    When edito la solicitud de detalle con los nuevos datos
    Then la solicitud de detalle se actualiza correctamente
    And retorno verdadero

  Scenario: Editar detalle de solicitud inexistente
    Given que tengo una solicitud de detalle inexistente
    When edito la solicitud de detalle con los nuevos datos
    Then la solicitud de detalle no se actualiza
    And retorno falso