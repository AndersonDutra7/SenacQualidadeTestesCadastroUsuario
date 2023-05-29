#language: pt
Funcionalidade: Cadastro de documentos

  Contexto:
    Dado que o usuário acessou a modal Cadastrar Documento

  @Basico
  Cenário: Cadastrando um Documento
    Dado que o usuário preencheu o campo Nome
    E o tamanho do campo Nome for menor ou igual a 100 caracteres
    E preencheu o campo Descricão com 4000 caracteres ou menos
    Quando clicar em Salvar
    Então o documento deve ser salvo com sucesso
    E o usuário criador deve ser associado automaticamente ao documento
    E deve apresentar a mensagem de feedback: Documento salvo com sucesso!

  @Básico
  Esquema do Cenário: Validação do campo Nome e campo Descrição
    Dado que o usuário não preencheu o campo Nome
    E ou preencheu o campo Nome com mais de 100 caracteres <caracteres>
    E ou preencheu o campo Descrição com mais de 4000 caracteres
    Quando o usuário clicar em Salvar
    Então deve apresentar uma mensagem de alerta indicando: <campo> <mensagem>
    Exemplos:
    |caracteres | campo     | mensagem                                               |
    | 0         | Nome      | O campo Nome deve ser obrigatório                      |
    | 101 >     | Nome      | O campo Nome não pode ultrapassar 100 caracteres       |
    | 4001 >    | Descrição | O campo Descrição não pode ultrapassar 4000 caracteres |

  @Geral
  Cenário: Visualização da Interface
    Quando o usuário estar à preencher os campos do documento
    Então a Interface deve apresentar os campos  somente os campos Data de Criação, Data de Término, Descrição e Anexo
    E os campos deve ser apresentados nesta mesma ordem em uma única aba

  @Especifico
  Cenário: Inserindo a Data de Término
    Dado que o usuário finalizou o preenchimento do documento
    E clicou em salvar
    E anexou o documento no sistema
    Quando algum usuário procurar por este documento
    Então sistema deve apresentar a Data de Término do documento ficar disponível no sistema

  @Especifico
  Cenário: A Data de Ínicio não pode ser maior que a Data de Término
    Dado que o usuário finalizou o documento
    E a Data de Criação dor maior que a Data de Término
    Quando clicar em salvar
    Então deve apresentar uma mensagem de alerta indicando: A Data de Início não pode ser maior que a Data de Término

  @Especifico
  Cenário: Fazendo upload do documento
    Dado preencheu o documento
    E o tamanho do documento ultrapasar 5GB
    Quando acessar o campo Anexo
    Então o sistema deve apresentar uma mensagem de alerta: O Documento não ode ultrapassar 5GB

  @Especifico
  Cenário: Cancelando o documento
    Dado que o usuário preencheu e salvou um documento
    E por ventura desistiu deste documento
    Quando clicar em Cancelar
    Então o sistema deverá excluir o upload do documento