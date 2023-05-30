//package stepdefinitions.TrabalhoFinal;
//
//import cucumber.api.java.es.Dado;
//import cucumber.api.java.it.Quando;
//import cucumber.api.java.pt.Então;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import util.Componentes;
//import util.FormularioFinal;
//
//public class StepsDesafio01e02 {
//
//    Componentes componentes = new Componentes();
//
//    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
//    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {
//
//        componentes.inicializarComponentes();
//    }
//
//    @Dado("que o usuário preencheu o campo Nome")
//    public void que_o_usuário_preencheu_o_campo_Nome() {
//        componentes.testarTextfieldNome();
//    }
//
//    @Dado("que o usuário preencheu o campo Sobrenome")
//    public void que_o_usuário_preencheu_o_campo_Sobrenome() {
//        componentes.testarTextfieldSobrenome();
//    }
//
//    @Dado("que o usuário preencheu o campo Sexo")
//    public void que_o_usuário_preencheu_o_campo_Sexo() {
//
//        componentes.testarRadioButtonSexo();
//    }
//
//    @Dado("que o usuário preencheu o campo comidaFavorita")
//    public void que_o_usuário_preencheu_o_campo_comidaFavorita() {
//
//        componentes.testarCheckboxComidaFavorita();
//    }
//
//    @Dado("que o usuário preencheu o campo escolaridade")
//    public void que_o_usuário_preencheu_o_campo_escolaridade() {
//
//        componentes.testarSelectEscolaridade();
//    }
//
//    @Dado("que o usuário preencheu o campo esportes")
//    public void que_o_usuário_preencheu_o_campo_esportes() {
//
//        componentes.testarSelectEsportes();
//    }
//
//    @Dado("que o usuário preencheu o campo sugestão")
//    public void que_o_usuário_preencheu_o_campo_sugestão() {
//
//        componentes.testarTextareaSugestoes();
//    }
//
//    @Quando("clicar no botão Cadastrar")
//    public void clicar_no_botão_Cadastrar() {
//        componentes.testarBotaoCadastrar();
//        componentes.validarBotaoCadastrar();
//        componentes.preencherFormulário();
//    }
//
//    @Então("as informações preenchidas devem ser exibidas no formulário final Anderson")
//    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Anderson() {
//        componentes.validarTextfieldNome();    }
//
//    @Então("as informações preenchidas devem ser exibidas no formulário final Dutra")
//    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Dutra() {
//        componentes.validarTextfieldSobrenome();
//    }
//
//    @Então("as informações preenchidas devem ser exibidas no formulário final Masculino")
//    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Masculino() {
//        componentes.validarRadioButtonSexo();
//    }
//
//    @Então("as informações preenchidas devem ser exibidas no formulário final Carne")
//    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Carne() {
//        componentes.validarCheckboxComidaFavorita();
//    }
//
//    @Então("as informações preenchidas devem ser exibidas no formulário final Superior")
//    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Superior() {
//        componentes.validarSelectEscolaridade();
//    }
//
//    @Então("as informações preenchidas devem ser exibidas no formulário final Futebol")
//    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Futebol() {
//        componentes.validarSelectEsportes();
//    }
//
//    @Então("as informações preenchidas devem ser exibidas no formulário final Estudar Mais")
//    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final_Estudar_Mais() {
//        componentes.validarTextareaSugestoes();
//    }
//
//    public void formulario(){
//        componentes.preencherFormulário();
//    }
//
//    @Dado("que o usuário não preenche o campo Nome {string}")
//    public void que_o_usuário_não_preenche_o_campo_Nome(String string) {
//         Write code here that turns the phrase above into concrete actions
//        componentes.testarTextfieldNomeObrigatorio();    }
//
//    @Dado("não preenche o campo Sobrenome Dutra")
//    public void não_preenche_o_campo_Sobrenome_Dutra() {
//         Write code here that turns the phrase above into concrete actions
//        componentes.testarTextfieldSobrenomeObrigatorio();
//    }
//
//    @Dado("não seleciona o campo Sexo Masculino")
//    public void não_seleciona_o_campo_Sexo_Masculino() {
//         Write code here that turns the phrase above into concrete actions
//        componentes.testarRadioButtonSexoObrigatorio();
//    }
//
//    @Quando("acionar o botão Cadastrar")
//    public void acionar_o_botão_Cadastrar() {
//         Write code here that turns the phrase above into concrete actions
//        componentes.testarBotaoCadastrar();
//    }
//
//    @Então("deve ser exibida uma mensagem indicando O campo Nome é obrigatório!")
//    public void deve_ser_exibida_uma_mensagem_indicando_O_campo_Nome_é_obrigatório() {
//         Write code here that turns the phrase above into concrete actions
//        componentes.validarNomeObrigatorio();
//    }
//
//    @Dado("que o usuário não preenche o campo Nome Anderson")
//    public void que_o_usuário_não_preenche_o_campo_Nome_Anderson() {
//         Write code here that turns the phrase above into concrete actions
//        componentes.testarTextfieldNomeObrigatorio();
//    }
//
//    @Dado("não preenche o campo Sobrenome {string}")
//    public void não_preenche_o_campo_Sobrenome(String string) {
//         Write code here that turns the phrase above into concrete actions
//        componentes.testarTextfieldSobrenomeObrigatorio();
//    }
//
//    @Então("deve ser exibida uma mensagem indicando O campo Sobrenome é obrigatório!")
//    public void deve_ser_exibida_uma_mensagem_indicando_O_campo_Sobrenome_é_obrigatório() {
//         Write code here that turns the phrase above into concrete actions
//        componentes.validarSobrenomeObrigatorio();
//    }
//
//    @Dado("não seleciona o campo Sexo {string}")
//    public void não_seleciona_o_campo_Sexo(String string) {
//         Write code here that turns the phrase above into concrete actions
//        componentes.testarRadioButtonSexoObrigatorio();
//    }
//
//    @Então("deve ser exibida uma mensagem indicando O campo Sexo é obrigatório!")
//    public void deve_ser_exibida_uma_mensagem_indicando_O_campo_Sexo_é_obrigatório() {
//         Write code here that turns the phrase above into concrete actions
//        componentes.validarSexoObrigatorio();
//    }
//}