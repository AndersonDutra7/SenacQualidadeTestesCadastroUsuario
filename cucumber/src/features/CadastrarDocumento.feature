#language: pt
Funcionalidade: Cadastro de documentos

  Contexto:
    Dado que o usuário acessou a modal Cadastrar Documento

  @Basico
  Cenário: o campo Nome deve ser obrigatório
    Dado que o usuário preencheu o campo Nome
    E o tamanho do campo Nome for menor ou igual a 100 caracteres
    E preencheu o documento 4000 caracteres ou menos
    Quando clicar em Salvar
    Então o documento deve ser salvo com sucesso
    E o usuário criador deve ser associado automaticamente ao documento
    E deve apresentar a mensagem de feedback: Documento salvo com sucesso!

  Esquema do Cenário: Validação de tamanho do campo Nome
    Dado que o usuário preencheu o campo Nome
    E preencheu o documento com mais de 4000 caracteres
    Quando o usuário digitar caracteres <caracteres> no campo <campo>
    Então o <campo> <mensagem>
    Exemplos:
      | caracteres | campo | mensagem|
      | 1          |

