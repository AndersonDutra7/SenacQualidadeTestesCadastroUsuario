# language: pt
Funcionalidade: Acessar Google

  Contexto:
    Dado que o usuário instanciou o chrome-driver

  @acessar_Google
  Cenário: Acessar Google
    Dado que o usuário digitou o endereço do Google no navegador
    E que o usuário digitou Soft Plan
    Quando clicar em Enter
    Então deve apresentar a lista de pesquisa com Soft Plan