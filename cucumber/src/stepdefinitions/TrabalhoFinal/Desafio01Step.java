package stepdefinitions.TrabalhoFinal;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.E;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import util.Componentes;

public class Desafio01Step{

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
}