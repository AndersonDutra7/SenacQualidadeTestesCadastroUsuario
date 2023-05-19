package stepdefinitions;

import cucumber.api.java.gl.Dado;
import cucumber.api.java.gl.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class AcessarGoogleStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário instanciou o chrome-driver")
    public void que_o_usuário_instanciou_o_chrome_driver() {
        // Write code here that turns the phrase above into concrete actions
        componentes.inicializar();
    }

    @Dado("que o usuário digitou o endereço do Google no navegador")
    public void que_o_usuário_digitou_o_endereço_do_Google_no_navegador() {
        // Write code here that turns the phrase above into concrete actions
        componentes.acessarGoogle();
    }

    @E("que o usuário digitou SENAC Palhoça")
    public void que_o_usuário_digitou_SENAC_Palhoça() {
        // Write code here that turns the phrase above into concrete actions
        componentes.pesquisarGoogle();
    }

    @Quando("clicar em Enter")
    public void clicar_em_Enter() {
        // Write code here that turns the phrase above into concrete actions
        componentes.clicarEnter();
    }

    @Então("deve apresentar a lista de pesquisa com SENAC Palhoça")
    public void deve_apresentar_a_lista_de_pesquisa_com_SENAC_Palhoça() {
        // Write code here that turns the phrase above into concrete actions
        componentes.resultadoPesquisa();
        componentes.fecharNavegador();
    }


}
