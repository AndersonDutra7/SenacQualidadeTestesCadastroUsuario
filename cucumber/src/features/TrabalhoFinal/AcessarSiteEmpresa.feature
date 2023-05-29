# language: pt
Funcionalidade: Acessar Google

  Contexto:
    Dado que o usuário instanciou o chrome-driver

  @acessar_Site_da_Empresa_que_trabalho
  Cenário: Acessar Site da Empresa que trabalho
    Dado que o usuário digitou o endereço do Google no navegador
    E que o usuário digitou Globo Renault
    Quando clicar em Enter
    Então deve apresentar a lista de pesquisa referente ao nome Globo Renault
    E o site da empresa deve ser acessado
    E deve ser validado se o site aberto realmente é o site da empresa