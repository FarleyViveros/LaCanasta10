Feature: Eliminar un detalle de solicitud

  Scenario: Eliminar un detalle de solicitud existente
    Given una solicitud con id 8
    When se quita la solicitud detalle
    Then la solicitud detalle es eliminado