Feature: Registro de cliente
  As cliente
  I want registrarme en la pagina

  Scenario: Registro exitoso
    Given que un cliente quiere registrarse
    When llena el formulario y se registra exitosamente
    Then su cuenta se creara y podra visualizar un mensaje de bienvenida