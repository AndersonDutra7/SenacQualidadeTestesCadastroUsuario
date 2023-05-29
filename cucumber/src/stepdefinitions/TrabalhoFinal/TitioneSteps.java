package stepdefinitions.TrabalhoFinal;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.TitioneUtil;
//import util.Componentes;

    public class TitioneSteps {

        TitioneUtil componentes = new TitioneUtil();

        @Dado("que o usuário acessou o arquivo Campo de treinamento")
        public void que_o_usuário_acessou_o_arquivo_Campo_de_treinamento() {
            componentes.inicializa();

        }


        @Dado("que apenas o campo nome estiver vazio")
        public void que_apenas_o_campo_nome_estiver_vazio() {
            componentes.preencheCampo("elementosForm:sobrenome","Sobrenome qualquer");
            componentes.selecionaRadioButton("elementosForm:sexo:0");
        }

        @Quando("o usuario clicou no botão Cadastrar")
        public void o_usuario_clicou_no_botão_Cadastrar() {
            componentes.interageBotao("elementosForm:cadastrar");
        }

        @Então("deve aparecer a mensagem de feedback Nome eh obrigatorio")
        public void deve_aparecer_a_mensagem_de_feedback_Nome_eh_obrigatorio() {
            componentes.validaAlertConfirm("Nome eh obrigatorio");
            componentes.fecharNavegador();
        }

        @Dado("que apenas o campo sobrenome estiver vazio")
        public void que_apenas_o_campo_sobrenome_estiver_vazio() {
            componentes.preencheCampo("elementosForm:nome","Nome qualquer");
            componentes.selecionaRadioButton("elementosForm:sexo:0");
        }

        @Então("deve aparecer a mensagem de feedback Sobrenome eh obrigatorio")
        public void deve_aparecer_a_mensagem_de_feedback_Sobrenome_eh_obrigatorio() {
            componentes.validaAlertConfirm("Sobrenome eh obrigatorio");
            componentes.fecharNavegador();
        }

        @Dado("que apenas o campo sexo estiver vazio")
        public void que_apenas_o_campo_sexo_estiver_vazio() {
            componentes.preencheCampo("elementosForm:nome","Nome qualquer");
            componentes.preencheCampo("elementosForm:sobrenome","Sobrenome qualquer");
        }

        @Então("deve aparecer a mensagem de feedback Sexo eh obrigatorio")
        public void deve_aparecer_a_mensagem_de_feedback_Sexo_eh_obrigatorio() {
            componentes.validaAlertConfirm("Sexo eh obrigatorio");
            componentes.fecharNavegador();
        }

        @Dado("que o usuário preencheu os dados obrigatórios")
        public void que_o_usuário_preencheu_os_dados_obrigatórios() {
            componentes.preencheCampo("elementosForm:nome","Nome qualquer");
            componentes.preencheCampo("elementosForm:sobrenome","Sobrenome qualquer");
            componentes.selecionaRadioButton("elementosForm:sexo:0");
        }

        @Dado("clicou no botão cadastrar")
        public void clicou_no_botão_cadastrar() {
            componentes.interageBotao("elementosForm:cadastrar");
        }

        @Então("os dados preenchidos devem ser mostrados em div junto com a confirmação de cadastro.")
        public void os_dados_preenchidos_devem_ser_mostrados_em_div_junto_com_a_confirmação_de_cadastro() {
            componentes.validaCampoResultado();
            componentes.validaDadosCampo("descNome", "Nome: Nome qualquer");
            componentes.validaDadosCampo("descSobrenome", "Sobrenome: Sobrenome qualquer");
            componentes.validaDadosCampo("descSexo", "Sexo: Masculino");
            componentes.validaDadosCampo("descComida","Comida:" );
            componentes.validaDadosCampo("descEscolaridade","Escolaridade: 1grauincomp" );
            componentes.validaDadosCampo("descEsportes","Esportes:" );
            componentes.validaDadosCampo("descSugestoes","Sugestoes:" );
            componentes.fecharNavegador();
        }

        @Dado("que o usuário preencheu todos os dados")
        public void que_o_usuário_preencheu_todos_os_dados() {
            componentes.preencheCampo("elementosForm:nome","Nome qualquer");
            componentes.preencheCampo("elementosForm:sobrenome","Sobrenome qualquer");
            componentes.selecionaRadioButton("elementosForm:sexo:0");
            componentes.selecionaComida();
            componentes.selecionarEscolaridade();
            componentes.selecionarValorEsporteMultiplo();
            componentes.preencheSugestoes();
        }

        @Então("todos os dados preenchidos devem ser mostrados em div junto com a confirmação de cadastro.")
        public void todos_os_dados_preenchidos_devem_ser_mostrados_em_div_junto_com_a_confirmação_de_cadastro() {
            componentes.validaCampoResultado();
            componentes.validaDadosCampo("descNome", "Nome: Nome qualquer");
            componentes.validaDadosCampo("descSobrenome", "Sobrenome: Sobrenome qualquer");
            componentes.validaDadosCampo("descSexo", "Sexo: Masculino");
            componentes.validaDadosCampo("descComida","Comida: Carne" );
            componentes.validaDadosCampo("descEscolaridade","Escolaridade: especializacao" );
            componentes.validaDadosCampo("descEsportes","Esportes: O que eh esporte?" );
            componentes.validaDadosCampo("descSugestoes","Sugestoes: Aqui funcionou! Na nova linha também!" );
            componentes.fecharNavegador();
        }





}
