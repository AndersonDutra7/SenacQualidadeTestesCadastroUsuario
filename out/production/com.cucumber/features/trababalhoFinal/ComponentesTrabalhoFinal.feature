# language: pt

Funcionalidade: Acessar vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo Campo de Treinamento

  @validar_Formulário_de_Cadastro
  Esquema do Cenário: Validar Formulário de Cadastro
    Quando o usuário preencher/selecionar <dados> no campo <campo>
    E clicar no botão Cadastrar
    Então deve apresentar os dados preenchidos <dadosPreenchidos>
    Exemplos:
      | dados             | campo            | dadosPreenchidos     |
      | Anderson          | textfield        | Anderson             |
      | Dutra             | textarea         | Dutra                |
      | rádio button      | rádio button     | rádio button         |
      | checkbox          | checkbox         | checkbox             |