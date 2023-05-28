package stepdefinitions.TrabalhoFinal;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import util.Componentes;

public class StepsDesafio {

    Componentes componentes = new Componentes();

    @Dado("que o usuário preencheu o campo Nome com Anderson")
    public void que_o_usuário_preencheu_o_campo_Nome_com_Anderson() {
        componentes.inicializarComponentes();
        componentes.testarTextfieldNome();
    }

    @Dado("preencheu o campo Sobrenome com Dutra")
    public void preencheu_o_campo_Sobrenome_com_Dutra() {
        // Write code here that turns the phrase above into concrete actions
        componentes.testarTextfieldSobrenome();
    }

    @Dado("selecionou o Sexo como Masculino")
    public void selecionou_o_Sexo_como_Masculino() {
        // Write code here that turns the phrase above into concrete actions
        componentes.testarRadioButtonSexo();
    }

    @Dado("selecionou a Comida Favorita como Carne")
    public void selecionou_a_Comida_Favorita_como_Carne() {
        // Write code here that turns the phrase above into concrete actions
        componentes.testarCheckboxComidaFavorita();
    }

    @Dado("selecionou sua Escolaridade como Superior")
    public void selecionou_sua_Escolaridade_como_Superior() {
        // Write code here that turns the phrase above into concrete actions
        componentes.testarSelectEscolaridade();
    }

    @Dado("selecionou os Esportes como Futebol")
    public void selecionou_os_Esportes_como_Futebol() {
        // Write code here that turns the phrase above into concrete actions
        componentes.testarSelectEsportes();
    }

    @Dado("preencheu a Sugestão como Estudar Mais")
    public void preencheu_a_Sugestão_como_Estudar_Mais() {
        // Write code here that turns the phrase above into concrete actions
        componentes.testarTextareaSugestoes();
    }

//    @Quando("clicar no botão Cadastrar")
//    public void clicar_no_botão_Cadastrar() {
//        componentes.testarBotaoCadastrar();
//        componentes.fecharNavegador();
//    }

    @Então("as informações preenchidas devem ser exibidas no formulário final")
    public void as_informações_preenchidas_devem_ser_exibidas_no_formulário_final() {
//        componentes.validarTextfieldNome();
//        componentes.validarTextfieldSobrenome();
//        componentes.validarRadioButtonSexo();
    }
}
