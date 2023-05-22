# language: pt
  Funcionalidade: Acessar Google

    Contexto:
      Dado que o usuário instanciou o chrome-driver

    @acessar_google
    Cenário: Acessar Google
      Dado que o usuário digitou o endereço do Google no navegador
      E que o usuário digitou SENAC Palhoça
      Quando clicar em Enter
      Então deve apresentar a lista de pesquisa com SENAC Palhoça
