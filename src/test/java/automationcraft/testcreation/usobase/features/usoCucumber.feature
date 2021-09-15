Feature: Busqueda en Google
  Como usuario
  Quiero realizar busquedas en Google
  Para encontrar informacion de lo buscado

  @test @smoke
  Scenario: Busqueda Simple con Datatable
    Given que estoy en la barra de busqueda
    When introduzco la palabra "tsoft"
    Then se muestra la siguiente informacion en los primeros 3 link
      |resultados|
      |HOME - TSOFT - Make IT Real|
      |Tsoft LinkedIn|
      |Tsoft LinkedIn|