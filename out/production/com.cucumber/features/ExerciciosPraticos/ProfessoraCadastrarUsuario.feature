#language:pt
Funcionalidade: Cadastrar usuários

  Contexto:
    Dado que o usuário acessou a modal Cadastrar Usuário

  @basico
  Cenário: Salvar usuário com campos obrigatórios
    Dado que o usuário preencheu os campos Nome, Login e Senha
    Quando clicar em Salvar
    Então o usuário deve ser salvo com sucesso
    E deve apresentar a mensagem de feedback Usuário salvo com sucesso!
    E o usuário deve ser apresentado na lista de usuários
    E a ação deve ser registrada na auditoria

  @geral
  Cenário: Salvar usuário com campos todos os campos
    Dado que o usuário preencheu os campos Nome, Nome da Mãe, CPF, Login, Senha
    Quando clicar em Salvar
    Então o usuário deve ser salvo com sucesso
    E deve apresentar a mensagem de feedback Usuário salvo com sucesso!
    E o usuário deve ser apresentado na lista de usuários
    E a ação deve ser registrada na auditoria

  @basico
  Esquema do Cenário: Os campos Nome, Login e Senha são obrigatórios
    Dado que o usuário não preencheu <campo>
    Quando clicar em Salvar
    Então deve apresentar a mensagem de feedback informando que <campo> <mensagem>
    Exemplos:
      | campo                         | mensagem         |
      | o campo Nome                  | é obrigatório    |
      | o campo Login                 | é obrigatório    |
      | o campo Senha                 | é obrigatório    |
      | os campos Nome e Login        | são obrigatórios |
      | os campos Nome e Senha        | são obrigatórios |
      | os campos Login e Senha       | são obrigatórios |
      | os campos Nome, Login e Senha | são obrigatórios |

  @geral
  Esquema do Cenário: Válidar senha
  A senha deve ser formada por pelo menos um carácter especial,
  por pelo menos uma letra maiúscula e
  no máximo 8 caracteres.
    Quando o usuário digitar a senha <senha>
    Então deve apresentar a mensagem de senha <validaInvalida>
    Exemplos:
      | senha    | validaInvalida |
      | aaaaaaaa | inválida       |
      | aaaaaaa  | inválida       |
      | Aaaaaaaa | inválida       |
      | Aaaaa8aa | inválida       |
      | Aaaa_aa6 | válida         |

  @geral
  Esquema do Cenário: O campo CPF deve ser válido
  - Uma maneira de verificar a veracidade do documento é conferir o último número antes do dígito,
    de acordo com a tabela abaixo:
  - Ex.: Nº:  003.939.708-41 = Código 8, corresponde ao Estado de São Paulo.
  - Veja abaixo o código de Identificação por Estado:
  - Código 0:  Rio Grande do Sul
  - Código 1:  Distrito Federal – Goiás – Mato Grosso – Mato Grosso do Sul – Tocantins
  - Código 2:  Pará – Amazonas – Acre – Amapá – Rondônia – Roraima
  - Código 3:  Ceará – Maranhão – Piauí
  - Código 4:  Pernambuco – Rio Grande do Norte – Paraíba – Alagoas
  - Código 5:  Bahia – Sergipe
  - Código 6:  Minas Gerais
  - Código 7:  Rio de Janeiro – Espírito Santo
  - Código 8:  São Paulo
  - Código 9: Paraná – Santa Catarina
    Dado que a máscara númerica para o cadastro do campo CPF é 000.000.000-00
    Quando o usuário digitar o CPF <cpf>
    Então <resultato>
    Exemplos:
      | cpf            | resultato                                                |
      | aaa.aaa.aaa-aa | o valor do cpf não deve permanecer no campo              |
      | 394.238.123-2  | deve informar que o CPF está inválido                    |
      | 2              | deve informar que o CPF está inválido                    |
      | 334.d23.565-uu | o valor diferente de número não deve permanecer no campo |
      | 234.344.654-99 | o valor do CPF deve ser validado corretamente            |

  @especifico
  Cenário: Campos disponíveis na modal Cadastrar Usuário
    Quando o usuário visulizar a modal Cadastrar Usuário
    Então os campo Nome, Nome da Mãe, CPF, Login, Senha devem estar disponíveis

  @especifico
  Esquema do Cenário: Validação de caracteres por campo
  - Campo Nome e Nome da Mãe deve perminitir no máximo, 256 caracteres;
  - O campo login deve aceitar no máximo 100 caracteres.
    Quando o usuário digitar <caracteres> caracteres no campo <campo>
    Então o <campo> <resultado>
    Exemplos:
      | caracteres | campo       | resultado                                         |
      | 1          | Nome        | deve ser apresentado corretamente                 |
      | 256        | Nome        | deve ser apresentado corretamente                 |
      | 257        | Nome        | deve apresentar no máximo caracter 256 caracteres |
      | 1          | Nome da Mãe | deve ser apresentado corretamente                 |
      | 256        | Nome da Mãe | deve ser apresentado corretamente                 |
      | 257        | Nome da Mãe | deve apresentar no máximo caracter 256 caracteres |
      | 1          | Login       | deve ser apresentado corretamente                 |
      | 100        | Login       | deve ser apresentado corretamente                 |
