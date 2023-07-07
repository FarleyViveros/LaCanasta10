Feature: Aprobar solicitud

  Scenario: Aprobar solicitud exitosamente
    Given una solicitud con proveedor ID "1", usuarioAprobo ID "1", fecha de aprobación "2022-11-26" y estado "2"
    When se aprueba la solicitud
    Then la solicitud debe ser actualizada correctamente

  Scenario: Falla al aprobar solicitud
    Given una solicitud con proveedor ID "123", usuarioAprobo ID "456", fecha de aprobación "2023-07-06" y estado "Aprobado"
    When se produce un error al aprobar la solicitud
    Then la solicitud no debe ser actualizada