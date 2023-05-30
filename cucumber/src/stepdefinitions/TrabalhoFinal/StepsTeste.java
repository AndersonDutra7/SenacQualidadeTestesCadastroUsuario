package stepdefinitions.TrabalhoFinal;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import org.openqa.selenium.WebDriver;
import util.Componentes;

public class StepsTeste {

    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {
        componentes.inicializarComponentes();
    }

    @Dado("que o usuário preencheu o campo Nome")
    public void que_o_usuário_preencheu_o_campo_Nome() {
        componentes.testarTextfieldNome();
    }

    @Dado("que o usuário preencheu o campo Sobrenome")
    public void que_o_usuário_preencheu_o_campo_Sobrenome() {
        componentes.testarTextfieldSobrenome();
    }

    @Dado("que o usuário preencheu o campo Sexo")
    public void que_o_usuário_preencheu_o_campo_Sexo() {
        componentes.testarRadioButtonSexo();
    }

    @Dado("que o usuário preencheu o campo comidaFavorita")
    public void que_o_usuário_preencheu_o_campo_comidaFavorita() {
        componentes.testarCheckboxComidaFavorita();
    }

    @Dado("que o usuário preencheu o campo escolaridade")
    public void que_o_usuário_preencheu_o_campo_escolaridade() {
        componentes.testarSelectEscolaridade();
    }

    @Dado("que o usuário preencheu o campo esportes")
    public void que_o_usuário_preencheu_o_campo_esportes() {
        componentes.testarSelectEsportes();
    }

    @Dado("que o usuário preencheu o campo sugestão")
    public void que_o_usuário_preencheu_o_campo_sugestão() {
        componentes.testarTextareaSugestoes();
    }

    @Quando("clicar no botão Cadastrar")
    public void clicar_no_botão_Cadastrar() {
        componentes.testarBotaoCadastrar();
        componentes.validarBotaoCadastrar();
        WebDriver driver = null;
        componentes.preencherFormulário(driver, "Nome", "Sobrenome", "Sexo");;

    }

    @Então("as informações preenchidas devem ser exibidas no formulário final Anderson")
    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Anderson() {
        componentes.validarTextfieldNome();
    }

    @Então("as informações preenchidas devem ser exibidas no formulário final Dutra")
    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Dutra() {
        componentes.validarTextfieldSobrenome();
    }

    @Então("as informações preenchidas devem ser exibidas no formulário final Masculino")
    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Masculino() {
        componentes.validarRadioButtonSexo();
    }

    @Então("as informações preenchidas devem ser exibidas no formulário final Carne")
    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Carne() {
        componentes.validarCheckboxComidaFavorita();
    }

    @Então("as informações preenchidas devem ser exibidas no formulário final Superior")
    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Superior() {
        componentes.validarSelectEscolaridade();
    }

    @Então("as informações preenchidas devem ser exibidas no formulário final Futebol")
    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Futebol() {
        componentes.validarSelectEsportes();
    }

    @Então("as informações preenchidas devem ser exibidas no formulário final Estudar Mais")
    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Estudar_Mais() {
        componentes.validarTextareaSugestoes();
    }

    @Dado("que o usuário não preenche o campo Nome {string}")
    public void que_o_usuário_não_preenche_o_campo_Nome(String string) {
        componentes.testarTextfieldNomeObrigatorio();
    }

    @Dado("não preenche o campo Sobrenome Dutra")
    public void não_preenche_o_campo_Sobrenome_Dutra() {
        componentes.testarTextfieldSobrenomeObrigatorio();
    }

    @Dado("não seleciona o campo Sexo Masculino")
    public void não_seleciona_o_campo_Sexo_Masculino() {
        componentes.testarRadioButtonSexoObrigatorio();
    }

    @Quando("acionar o botão Cadastrar")
    public void acionar_o_botão_Cadastrar() {
        componentes.testarBotaoCadastrar();
    }

    @Então("deve ser exibida uma mensagem indicando O campo Nome é obrigatório!")
    public void deve_ser_exibida_uma_mensagem_indicando_O_campo_Nome_é_obrigatório() {
        componentes.validarNomeObrigatorio();
    }

    @Dado("que o usuário não preenche o campo Nome Anderson")
    public void que_o_usuário_não_preenche_o_campo_Nome_Anderson() {
        componentes.testarTextfieldNomeObrigatorio();
    }

    @Dado("não preenche o campo Sobrenome {string}")
    public void não_preenche_o_campo_Sobrenome(String string) {
        componentes.testarTextfieldSobrenomeObrigatorio();
    }

    @Então("deve ser exibida uma mensagem indicando O campo Sobrenome é obrigatório!")
    public void deve_ser_exibida_uma_mensagem_indicando_O_campo_Sobrenome_é_obrigatório() {
        componentes.validarSobrenomeObrigatorio();
    }

    @Dado("não seleciona o campo Sexo {string}")
    public void não_seleciona_o_campo_Sexo(String string) {
        componentes.testarRadioButtonSexoObrigatorio();
    }

    @Então("deve ser exibida uma mensagem indicando O campo Sexo é obrigatório!")
    public void deve_ser_exibida_uma_mensagem_indicando_O_campo_Sexo_é_obrigatório() {
        componentes.validarSexoObrigatorio();
    }
}

