# language: pt

Funcionalidade: Acessar vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo Campo de Treinamento
  @Validar_campo_textfield
  Cenário: Validar campo textfield
    Quando o usuário digitar Batatinha
    Então no campo textfield deve apresentar a palavra Batatinha1
  @Validar_campo_textarea
  Cenário: Validar campo textarea
    Quando o usuário digitar Batatatinha2
    Então no campo textarea deve apresentar a palavra Batatinha2

  @Validar_os_campos_textfield_e_textarea
  Esquema do Cenário: Validar os campos textfield e textarea
    Quando o usuário digitar <palavra>
    Então no campo <campo> deve apresentar a palavra <palavraDigitada>
    Exemplos:
    | palavra             | campo    | palavraDigitada     |
    | Batatinha1          | textfield| Batatinha1          |
    | Batatinha2          | textarea | Batatinha2          |

  @Validar_elemento_radio_button
  Cenário: Validar elemento Radio Button
    Quando o usuário clicar no elemento rádio button
    Então o elemento rádio button deve apresentar selecionado

  @Validar_elemento_checkbox
  Cenário: Validar elemento Checkbox
    Quando o usuário clicar no elemento checkbox
    Então o elemento checkbox deve apresentar selecionado

  @Validar_os_componentes_radio_button_e_checkbox
  Esquema do Cenário: Validar os campos rádio button e checkbox
    Quando o usuário clicar no elemento <click>
    Então o elemento <elemento> deve apresentar selecionado
    Exemplos:
      | click             | elemento       |
      | rádio button      | rádio button   |
      | checkbox          | checkbox       |