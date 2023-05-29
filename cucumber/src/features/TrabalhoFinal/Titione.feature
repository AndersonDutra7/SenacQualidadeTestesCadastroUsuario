#language: pt
@acessar_varios_componentes_html
Funcionalidade: Acessar vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo Campo de Treinamento

  @validar_campos_obrigatorios
  Esquema do Cenário: Validar campos obrigatórios
    Dado que apenas o campo <campo> estiver vazio
    Quando o usuario clicou no botão Cadastrar
    Então deve aparecer a mensagem de feedback <retorno>
    Exemplos:
      | campo     | retorno                  |
      | nome      | Nome eh obrigatorio      |
      | sobrenome | Sobrenome eh obrigatorio |
      | sexo      | Sexo eh obrigatorio      |

  @preencher_apenas_dados_obrigatórios
  Cenário: Preencher dados obrigatórios
    Dado que o usuário preencheu os dados obrigatórios
    E clicou no botão cadastrar
    Então os dados preenchidos devem ser mostrados em div junto com a confirmação de cadastro.

  @preencher_dados_obrigatórios_e_não_obrigatórios
  Cenário: preencher dados do formulário de cadastro
    Dado que o usuário preencheu todos os dados
    E clicou no botão cadastrar
    Então todos os dados preenchidos devem ser mostrados em div junto com a confirmação de cadastro.