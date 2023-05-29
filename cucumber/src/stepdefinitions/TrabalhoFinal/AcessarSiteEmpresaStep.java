package stepdefinitions.TrabalhoFinal;

import cucumber.api.java.gl.Dado;
import cucumber.api.java.gl.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class AcessarSiteEmpresaStep{

    Componentes componentes = new Componentes();

    @Dado("que o usuário instanciou o chrome-driver")
    public void que_o_usuário_instanciou_o_chrome_driver() {
        componentes.inicializar();
    }

    @Dado("que o usuário digitou o endereço do Google no navegador")
    public void que_o_usuário_digitou_o_endereço_do_Google_no_navegador() {
        componentes.acessarGoogle();
    }

    @E("que o usuário digitou Globo Renault")
    public void que_o_usuário_digitou_Globo_Renault() {
        componentes.pesquisarGoogle();
    }

    @Quando("clicar em Enter")
    public void clicar_em_Enter() {
        componentes.clicarEnter();
    }

    @Então("deve apresentar a lista de pesquisa referente ao nome Globo Renault")
    public void deve_apresentar_a_lista_de_pesquisa_referente_ao_nome_Globo_Renault() {
        componentes.resultadoPesquisa();
    }

    @E("o site da empresa deve ser acessado")
    public void o_site_da_empresa_deve_ser_acessado(){
        componentes.acessarSitedaEmpresa();
    }

    @E("deve ser validado se o site aberto realmente é o site da empresa")
    public void deve_ser_validado_se_o_site_aberto_realmente_é_o_site_da_empresa(){
        componentes.validarAcessoSite();
    }

}
