Feature: Quitar Pedido Detalle

  Scenario: Eliminar un detalle de pedido
    Given un pedido detalle con id 17
    When se quita el pedido detalle
    Then el pedido detalle es eliminado

  Scenario: Intentar eliminar un detalle de pedido inexistente
    Given un pedido detalle con id inexistente
    When se intenta quitar el pedido detalle
    Then la eliminación del pedido detalle falla