# language: pt

Funcionalidade: Acessar vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo Campo de Treinamento

  Cenário: Validar campo textfield
    Quando o usuário digitar Batatinha
    Então no campo textfield deve apresentar a palavra Batatinha


