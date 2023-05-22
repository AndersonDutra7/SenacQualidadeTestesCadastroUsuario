package stepdefinitions.TrabalhoFinal;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.E;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import org.openqa.selenium.Alert;
import util.Componentes;

public class Desafio02Step {

    Componentes componentes = new Componentes();

    @Dado("que o usuário não preenche o campo Nome")
    public void que_o_usuário_não_preenche_o_campo_Nome(){
        componentes.fecharNavegador();
    }

    @E("não preenche o campo Sobrenome")
    public void não_preenche_o_campo_Sobrenome(){
        componentes.fecharNavegador();
    }

    @E("não seleciona o campo Sexo")
    public void não_seleciona_o_campo_Sexo(){
        componentes.fecharNavegador();
    }
    @Quando("acionar o botão Cadastrar")
    public void acionar_o_botão_Cadastrar(){
        componentes.fecharNavegador();
    }

    @Então("deve ser exibida uma mensagem indicando que os campos são obrigatórios")
    public void deve_ser_exibida_uma_mensagem_indicando_que_os_campos_são_obrigatórios(){
        componentes.fecharNavegador();
    }

}