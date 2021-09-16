Feature: Busqueda en Traslados
  Como usuario web
  Quiero buscar en viajesFalabella
  Para encontrar traslados

  @test
  Scenario: Intento de busqueda con campos incompletos
    Given estoy en un navegador en la seccion de traslados de ViajesFalabella
    When introduzco la palabra "Sheraton Pilar" en el campo hasta
    And introduzco como fecha el dia Mar, 21 sep 2021
    Then el navegador muestra una alerta de los campos faltantes