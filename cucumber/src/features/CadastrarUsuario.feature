#language: pt
Funcionalidade: Cadastro de usuários

  Contexto:
    Dado que o usuário acessou a modal Cadastrar Usuário
  @Basico
  Cenário: Salvar usuário com todos os campos
    Dado que o usuário preencheu os campos Nome, Nome da Mãe, CPF, Login, Senha
    Quando clicar em Salvar
    Então o usuário deve ser salvo com sucesso
    E deve apresentar a mensagem de feedback Usuário salvo com sucesso!
    E o usuário deve ser apresentado na lista de usuários
    E a ação deve ser registrada na auditoria

  @Geral
  Esquema do Cenário: Os campos Nome, Login e Senha são obrigatórios
    Dado que o usuário não preencheu <campo>
    Quando clicar em Salvar
    Então deve apresentar a mensagem de feedback informando que <campo> <mensagem>
    Exemplos:
      | campo                             | mensagem        |
      | o campo Nome                      | é obrigatório   |
      | o campo Login                     | é obrigatório   |
      | o campo Senha                     | é obrigatório   |
      | os campos Nome e Login            | são obrigatórios|
      | os campos Nome e Senha            | são obrigatórios|
      | os campos Login e Senha           | são obrigatórios|
      | os campos Nome, Login e Senha     | são obrigatórios|

  @Geral
  Esquema do Cenário: Os campos Nome e Nome da Mãe devem ter no máximo 256 caracteres
    Dado que o usuário preencheu o campo Nome com mais de 0 caracteres
    E preencheu o campo Nome com mais de 256 caracteres
    E ou preencheu o campo Nome da Mãe com mais de 256 caracteres
    Quando clicar em salvar
    Então deve apresentar uma mensagem de erro informando <campo> <mensagem>
    Exemplos:
      | campo                             | mensagem                                      |
      | o campo Nome                      | deve possuir no máximo 256 caracteres         |
      | o campo Nome da Mãe               | deve possuir no máximo 256 caracteres         |
      | os campos Nome e Nome da Mãe      | ambos devem possuirem no máximo 256 caracteres|

  @Geral
  Esquema do Cenário: O CPF deve ser válido
    Dado que o usuário preencheu o CPF
    E o número digitado do CPF não possui 11 números
    Quando clicar em salvar
    Então deve apresentar uma mensagem de erro indicando <campo> <mensagem>
    Exemplos:
      | campo                         | mensagem                  |
      | o campo CPF                   | deve possuir 11 caracteres|

  Esquema do Cenário: O campo login deve aceitar no máximo 100 caracteres
    Dado que o usuário preencheu o campo Login com mais de 0 caracteres
    E preencheu o campo Login com 257 caracteres ou mais
    Quando clicar em salvar
    Então deve apresentar uma mensagem de erro indicando <campo> <mensagem>
    Exemplos:
      | campo                           | mensagem                            |
      | o campo Login                   | deve possuir no máximo 100 caracteres|

  Cenário: A senha deve ser formada por pelo menos um carácter especial, por pelo menos
            uma letra maiúscula e no máximo 8 caracteres
    Dado que o usuário preencheu o campo Senha
    E não inseriu pelo menos 1 caracter especial
    E não inseriu pelo menos 1 letra maiúscula
    E o tamanho da senha ultrapassou 8 caracteres
    Quando clicar em salvar
    Então deve apresentar mensagem de erro indicando Senha Inválida
    E deve apresentar uma mensagem intuitiva informando que a senha deve conter pelo menos 1 caracter especial
    E deve apresentar uma mensagem intuitiva informando que a senha deve conter pelo menos 1 letra maiúscula
    E deve apresentar uma mensagem inuitiva informando que a senha deve conter no máximo 8 caracteres

  Cenário: Deve ser possível cadastrar no máximo 100 usuários
    Dado que o usuário acessou o modal Cadastrar Usuário
    E já existem 100 usuários cadastrados
    E tentar preencher algum dos campos
    Quando clicar em salvar
    Então deve apresentar uma mensagem indicando Limite Máximo de Cadastros Já Realizados



