Feature: Realizar compras
  @compra
  Scenario: El usuario realiza una compra de producto
    Given el usuario ha iniciado sesion correctamente
      | user      | password  |
      | jbarrios  | georgedj  |
    When agrega los productos al carrito
    And procede a pagar el producto
    Then el sistema muestra el mensaje Thank you for your purcharse
