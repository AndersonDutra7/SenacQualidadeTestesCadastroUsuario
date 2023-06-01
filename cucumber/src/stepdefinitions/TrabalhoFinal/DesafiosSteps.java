package stepdefinitions.TrabalhoFinal;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import util.Componentes;

public class DesafiosSteps {

    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {
        componentes.inicializarComponentes();
    }

    @Dado("que o usuário preencheu os campos Nome, Sobrenome, Sexo, ComidaFavorita, Escolaridade, Esportes e Sugestão")
    public void que_o_usuário_preencheu_os_campos_Nome_Sobrenome_Sexo_ComidaFavorita_Escolaridade_Esportes_e_Sugestão() {
        componentes.testarTextfieldNome();
        componentes.testarTextfieldSobrenome();
        componentes.testarRadioButtonSexo();
        componentes.testarCheckboxComidaFavorita();
        componentes.testarSelectEscolaridade();
        componentes.testarSelectEsportes();
        componentes.testarTextareaSugestoes();
    }

    @Quando("clicar no botão Cadastrar")
    public void clicar_no_botão_Cadastrar() {
        componentes.testarBotaoCadastrar();
    }

    @Então("as informações preenchidas Anderson devem ser validadas no formulário final nome")
    public void as_informações_preenchidas_Anderson_devem_ser_validadas_no_formulário_final_nome() {
        componentes.validarTextfieldNome();
        componentes.fecharNavegador();
    }

    @Então("as informações preenchidas Dutra devem ser validadas no formulário final sobrenome")
    public void as_informações_preenchidas_Dutra_devem_ser_validadas_no_formulário_final_sobrenome() {
        componentes.validarTextfieldSobrenome();
        componentes.fecharNavegador();
    }

    @Então("as informações preenchidas Masculino devem ser validadas no formulário final sexo")
    public void as_informações_preenchidas_Masculino_devem_ser_validadas_no_formulário_final_sexo() {
        componentes.validarRadioButtonSexo();
        componentes.fecharNavegador();
    }

    @Então("as informações preenchidas Carne devem ser validadas no formulário final comidaFavorita")
    public void as_informações_preenchidas_Carne_devem_ser_validadas_no_formulário_final_comidaFavorita() {
        componentes.validarCheckboxComidaFavorita();
        componentes.fecharNavegador();
    }

    @Então("as informações preenchidas superior devem ser validadas no formulário final escolaridade")
    public void as_informações_preenchidas_superior_devem_ser_validadas_no_formulário_final_escolaridade() {
        componentes.validarSelectEscolaridade();
        componentes.fecharNavegador();
    }

    @Então("as informações preenchidas Futebol devem ser validadas no formulário final esportes")
    public void as_informações_preenchidas_Futebol_devem_ser_validadas_no_formulário_final_esportes() {
        componentes.validarSelectEsportes();
        componentes.fecharNavegador();
    }

    @Então("as informações preenchidas Estudar Mais devem ser validadas no formulário final sugestoes")
    public void as_informações_preenchidas_Estudar_Mais_devem_ser_validadas_no_formulário_final_sugestoes() {
        componentes.validarTextareaSugestoes();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preencheu o campo nome")
    public void que_o_usuário_não_preencheu_o_campo_nome() {
        componentes.testarTextfieldNomeObrigatorio();
    }

    @Então("deve ser exibida uma mensagem O campo Nome é obrigatório!")
    public void deve_ser_exibida_uma_mensagem_O_campo_Nome_é_obrigatório() {
        componentes.validarNomeObrigatorio();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preencheu o campo sobrenome")
    public void que_o_usuário_não_preencheu_o_campo_sobrenome() {
        componentes.testarTextfieldNome();
        componentes.testarTextfieldSobrenomeObrigatorio();
    }

    @Então("deve ser exibida uma mensagem O campo Sobrenome é obrigatório!")
    public void deve_ser_exibida_uma_mensagem_O_campo_Sobrenome_é_obrigatório() {
        componentes.validarSobrenomeObrigatorio();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preencheu o campo sexo")
    public void que_o_usuário_não_preencheu_o_campo_sexo() {
        componentes.testarTextfieldNome();
        componentes.testarTextfieldSobrenome();
        componentes.testarRadioButtonSexoObrigatorio();
    }

    @Então("deve ser exibida uma mensagem O campo Sexo é obrigatório!")
    public void deve_ser_exibida_uma_mensagem_O_campo_Sexo_é_obrigatório() {
        componentes.validarSexoObrigatorio();
        componentes.fecharNavegador();
    }
}