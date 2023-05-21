# language: pt

Funcionalidade: Acessar vários componentes html


  Contexto:
    Dado que o usuário acessou o arquivo Campo de Treinamento
  @validar_formulário_final
  Esquema do Cenário: Validar Formulário Final
    Dado que o usuário preencheu o campo Nome com <nome>
    E preencheu o campo Sobrenome com <sobrenome>
    E selecionou o Sexo como <sexo>
    E selecionou a Comida Favorita como <comidaFavorita>
    E selecionou os Esportes como <esportes>
    E preencheu a Sugestão como <sugestão>
    Quando clicar no botão Cadastrar
    Então as informações preenchidas devem ser exibidas no formulário final
    Exemplos:
    | nome    | sobrenome| sexo     | comidaFavorita| esportes| sugestão    |
    | Anderson| Dutra    | Masculino| Carne         | Futebol | Estudar Mais|
