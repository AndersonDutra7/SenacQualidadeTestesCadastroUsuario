package stepdefinitions.TrabalhoFinal;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.E;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import util.Componentes;

public class DesafioComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {

        componentes.inicializarComponentes();
    }

    @E("que o usuário preencheu o campo Nome com Anderson")
    public void que_o_usuário_preencheu_o_campo_Nome_com_Anderson() {
        componentes.testarTextfieldNome();
    }

    @E("preencheu o campo Sobrenome com Dutra")
    public void preencheu_o_campo_Sobrenome_com_Dutra() {
        componentes.testarTextfieldSobrenome();
    }

    @E("selecionou o Sexo como Masculino")
    public void selecionou_o_Sexo_como_Masculino() {
        componentes.testarRadioButtonSexo();
    }

    @E("selecionou a Comida Favorita como Carne")
    public void selecionou_a_Comida_Favorita_como_Carne() {
        componentes.testarCheckboxComidaFavorita();
    }

    @E("selecionou sua Escolaridade como Superior")
    public void selecionou_sua_Escolaridade_como_Superior(){
        componentes.testarSelectEscolaridade();
    }


    @E("selecionou os Esportes como Futebol")
    public void selecionou_os_Esportes_como_Futebol() {
        componentes.testarSelectEsportes();
    }

    @E("preencheu a Sugestão como Estudar Mais")
    public void preencheu_a_Sugestão_como_Estudar_Mais() {
        componentes.testarTextareaSugestoes();
    }

    @Quando("clicar no botão Cadastrar")
    public void clicar_no_botão_Cadastrar() {
        componentes.testarBotaoCadastrar();
    }

    @Então("as informações preenchidas devem ser exibidas no formulário final")
    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final() {
        componentes.validarBotaoCadastrar();
//        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preenche o campo Nome")
    public void que_o_usuário_não_preenche_o_campo_Nome(){
        componentes.validarNomeObrigatorio();
    }

    @E("não preenche o campo Sobrenome")
    public void não_preenche_o_campo_Sobrenome(){
        componentes.validarSobrenomeObrigatorio();
    }

    @E("não seleciona o campo Sexo")
    public void não_seleciona_o_campo_Sexo(){
        componentes.validarSexoObrigatorio();
    }
    @Quando("acionar o botão Cadastrar")
    public void acionar_o_botão_Cadastrar(){
        componentes.testarBotaoCadastrar();
    }

    @Então("deve ser exibida uma mensagem indicando que os campos são obrigatórios")
    public void deve_ser_exibida_uma_mensagem_indicando_que_os_campos_são_obrigatórios(){
        componentes.validarNomeObrigatorio();
        componentes.validarSobrenomeObrigatorio();
        componentes.validarSexoObrigatorio();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preenche o campo Nome {string}")
    public void que_o_usuário_não_preenche_o_campo_Nome(String string) {
        componentes.validarNomeObrigatorio();
    }

    @Dado("não preenche o campo Sobrenome Dutra")
    public void não_preenche_o_campo_Sobrenome_Dutra() {
        componentes.validarSobrenomeObrigatorio();    }

    @Dado("não seleciona o campo Sexo Masculino")
    public void não_seleciona_o_campo_Sexo_Masculino() {
componentes.validarSexoObrigatorio();    }

    @Então("deve ser exibida uma mensagem O campo Nome é obrigatório! indicando que os campos são obrigatórios")
    public void deve_ser_exibida_uma_mensagem_O_campo_Nome_é_obrigatório_indicando_que_os_campos_são_obrigatórios() {
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preenche o campo Nome Anderson")
    public void que_o_usuário_não_preenche_o_campo_Nome_Anderson() {
        // Write code here that turns the phrase above into concrete actions
        componentes.validarNomeObrigatorio();
    }

    @Dado("não preenche o campo Sobrenome {string}")
    public void não_preenche_o_campo_Sobrenome(String string) {
        // Write code here that turns the phrase above into concrete actions
        componentes.validarSobrenomeObrigatorio();
    }

    @Então("deve ser exibida uma mensagem O campo Sobrenome é obrigatório! indicando que os campos são obrigatórios")
    public void deve_ser_exibida_uma_mensagem_O_campo_Sobrenome_é_obrigatório_indicando_que_os_campos_são_obrigatórios() {
        // Write code here that turns the phrase above into concrete actions
        componentes.validarSobrenomeObrigatorio();
    }

    @Dado("não seleciona o campo Sexo {string}")
    public void não_seleciona_o_campo_Sexo(String string) {
        // Write code here that turns the phrase above into concrete actions
        componentes.validarSexoObrigatorio();
    }

    @Então("deve ser exibida uma mensagem O campo Sexo é obrigatório! indicando que os campos são obrigatórios")
    public void deve_ser_exibida_uma_mensagem_O_campo_Sexo_é_obrigatório_indicando_que_os_campos_são_obrigatórios() {
        // Write code here that turns the phrase above into concrete actions
        componentes.fecharNavegador();    }
}