#language: pt
#
#Validar regras de negócio:
#  -- Nome é obrigatório;
#  -- Sobrenome é obrigatório;
#  -- Sexo é obrigatório;

Funcionalidade: Acessar vários componentes html


  Contexto:
    Dado que o usuário acessou o arquivo Campo de Treinamento

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
