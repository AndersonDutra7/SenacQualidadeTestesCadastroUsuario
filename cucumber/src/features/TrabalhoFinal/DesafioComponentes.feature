# language: pt

#Desafio 01
#Em apenas um esquema de cenário, preencher seu nome, seu sobrenome, seu sexo, sua comida preferida,
#sua escolaridade, qual esporte você pratica, alguma sugestão e clicar no botão Cadastrar.
#Após clicar no botão cadastrar, validar todas as informações preenchidas no formulário que será
#apresentado no formulário no final da página.

Funcionalidade: Acessar vários componentes html


  Contexto:
    Dado que o usuário acessou o arquivo Campo de Treinamento
  @validar_formulário_final
  Esquema do Cenário: Validar Formulário Final
    Dado que o usuário preencheu o campo Nome com <nome>
    E preencheu o campo Sobrenome com <sobrenome>
    E selecionou o Sexo como <sexo>
    E selecionou a Comida Favorita como <comidaFavorita>
    E selecionou sua Escolaridade como <escolaridade>
    E selecionou os Esportes como <esportes>
    E preencheu a Sugestão como <sugestão>
    Quando clicar no botão Cadastrar
    Então as informações preenchidas devem ser exibidas no formulário final
    Exemplos:
    | nome    | sobrenome| sexo     | comidaFavorita| escolaridade  | esportes | sugestão     |
    | Anderson| Dutra    | Masculino| Carne         | Superior      | Futebol  | Estudar Mais |

#  -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=  #

#Desafio 02
#Validar regras de negócio:
#-- Nome é obrigatório;
#-- Sobrenome é obrigatório;
#-- Sexo é obrigatório;

  @validar_campos_obrigatorios
  Esquema do Cenário: Validar Campos Obrigatórios
    Dado que o usuário não preenche o campo Nome <nome>
    E não preenche o campo Sobrenome <sobrenome>
    E não seleciona o campo Sexo <sexo>
    Quando acionar o botão Cadastrar
    Então deve ser exibida uma mensagem <mensagem> indicando que os campos são obrigatórios
    Exemplos:
      | nome     | sobrenome | sexo        | mensagem                         |
      | ""       | Dutra     | Masculino   | O campo Nome é obrigatório!      |
      | Anderson | ""        | Masculino   | O campo Sobrenome é obrigatório! |
      | Anderson | Dutra     | ""          | O campo Sexo é obrigatório!      |

#  -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=  #
