# language: pt

#Desafio 01
# Em apenas um esquema de cenário, preencher seu nome, seu sobrenome, seu sexo, sua comida preferida,
#sua escolaridade, qual esporte você pratica, alguma sugestão e clicar no botão Cadastrar.
# Após clicar no botão cadastrar, validar todas as informações preenchidas no formulário que será
#apresentado no formulário no final da página.

Funcionalidade: Acessar vários componentes html


  Contexto:
    Dado que o usuário acessou o arquivo Campo de Treinamento

  @validar_formulário_final
  Esquema do Cenário: Validar Formulário Final
    Dado que o usuário preencheu os campos Nome, Sobrenome, Sexo, ComidaFavorita, Escolaridade, Esportes e Sugestão
    Quando clicar no botão Cadastrar
    Então as informações preenchidas <informações> devem ser validadas no formulário final <formulário final>
    Exemplos:
    | informações    | formulário final|
    | Anderson       | nome            |
    | Dutra          | sobrenome       |
    | Masculino      | sexo            |
    | Carne          | comidaFavorita  |
    | superior       | escolaridade    |
    | Futebol        | esportes        |
    | Estudar Mais   | sugestoes       |


#
#  -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=  #

#Desafio 02
# Validar regras de negócio:
#-- Nome é obrigatório;
#-- Sobrenome é obrigatório;
#-- Sexo é obrigatório;

  @validar_campos_obrigatorios
  Esquema do Cenário: Validar Campos Obrigatórios
    Dado que o usuário não preencheu o campo <campo>
    Quando clicar no botão Cadastrar
    Então deve ser exibida uma mensagem <mensagem>
    Exemplos:
      | campo                  | mensagem                                          |
      | nome                   | O campo Nome é obrigatório!                       |
      | sobrenome              | O campo Sobrenome é obrigatório!                  |
      | sexo                   | O campo Sexo é obrigatório!                       |
#      | nome e sobrenome       | Os campos Nome e Sobrenome são obrigatórios       |
#      | nome e sexo            | Os campos Nome e Sexo são obrigatórios            |
#      | sexo e sobrenome       | Os campos Sexo e Sobrenome são obrigatórios       |
#      | nome, sexo e sobrenome | Os campos Nome, Sobrenome e Sexo são obrigatórios |

#  -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=  #