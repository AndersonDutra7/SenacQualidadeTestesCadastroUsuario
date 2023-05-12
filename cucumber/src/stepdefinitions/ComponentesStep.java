package stepdefinitions;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.E;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import util.Componentes;

public class ComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {
        componentes.inicializarComponentes();
    }

    @Quando("o usuário digitar Batatinha1")
    public void o_usuário_digitar_Batatinha1() {
        componentes.testarTextfield();
    }

    @Então("no campo textfield deve apresentar a palavra Batatinha1")
    public void no_campo_textfield_deve_apresentar_a_palavra_Batatinha1() {
        componentes.validarTextfield();
//        componentes.fecharComponentes();
    }

    @Quando("o usuário digitar Batatinha2")
    public void o_usuário_digitar_Batatinha2() {
        componentes.testarTextarea();
    }

    @Então("no campo textarea deve apresentar a palavra Batatinha2")
    public void no_campo_textarea_deve_apresentar_a_palavra_Batatinha2() {
        componentes.validarTextarea();
    }

    @Quando("o usuário clicar no elemento rádio button")
    public void o_usuário_clicar_no_elemneto_rádio_button() {
        componentes.testarRadioButton();
    }

    @Então("o elemento rádio button deve apresentar selecionado")
    public void o_elemento_rádio_button_deve_apresentar_selecionado() {
        componentes.validarRadioButton();
    }

    @Quando("o usuário clicar no elemento checkbox")
    public void o_usuário_clicar_no_elemento_checkbox() {
        componentes.testarCheckbox();
    }

    @Então("o elemento checkbox deve apresentar selecionado")
    public void o_elemento_checkbox_deve_apresentar_selecionado() {
        componentes.validarCheckbox();
    }





}
