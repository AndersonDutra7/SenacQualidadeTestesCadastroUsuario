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

    @Dado("que o usuário preencheu os campos Nome, Sobrenome, Sexo, ComidaFavorita, Escolaridade, Esportes e Sugestão")
    public void que_o_usuário_preencheu_os_campos_Nome_Sobrenome_Sexo_ComidaFavorita_Escolaridade_Esportes_e_Sugestão() {
        componentes.testarTextfieldNome();
        componentes.testarTextfieldSobrenome();
        componentes.testarRadioButtonSexo();
        componentes.testarCheckboxComidaFavorita();
        componentes.testarSelectEscolaridade();
        componentes.testarSelectEsportes();
        componentes.testarTextareaSugestoes();
    }

    @Quando("clicar no botão Cadastrar")
    public void clicar_no_botão_Cadastrar() {
        componentes.testarBotaoCadastrar();    }

    @Então("as informações preenchidas Anderson devem ser validadas no formulário final nome")
    public void as_informações_preenchidas_Anderson_devem_ser_validadas_no_formulário_final_nome() {
        componentes.validarTextfieldNome();
        componentes.fecharNavegador();
    }

    @Então("as informações preenchidas Dutra devem ser validadas no formulário final sobrenome")
    public void as_informações_preenchidas_Dutra_devem_ser_validadas_no_formulário_final_sobrenome() {
        componentes.validarTextfieldSobrenome();
        componentes.fecharNavegador();
    }

    @Então("as informações preenchidas Masculino devem ser validadas no formulário final sexo")
    public void as_informações_preenchidas_Masculino_devem_ser_validadas_no_formulário_final_sexo() {
        componentes.validarRadioButtonSexo();
        componentes.fecharNavegador();
    }

    @Então("as informações preenchidas Carne devem ser validadas no formulário final comidaFavorita")
    public void as_informações_preenchidas_Carne_devem_ser_validadas_no_formulário_final_comidaFavorita() {
        componentes.validarCheckboxComidaFavorita();
        componentes.fecharNavegador();
    }

    @Então("as informações preenchidas superior devem ser validadas no formulário final escolaridade")
    public void as_informações_preenchidas_superior_devem_ser_validadas_no_formulário_final_escolaridade() {
        componentes.validarSelectEscolaridade();
        componentes.fecharNavegador();
    }

    @Então("as informações preenchidas Futebol devem ser validadas no formulário final esportes")
    public void as_informações_preenchidas_Futebol_devem_ser_validadas_no_formulário_final_esportes() {
        componentes.validarSelectEsportes();
        componentes.fecharNavegador();
    }

    @Então("as informações preenchidas Estudar Mais devem ser validadas no formulário final sugestoes")
    public void as_informações_preenchidas_Estudar_Mais_devem_ser_validadas_no_formulário_final_sugestoes() {
        componentes.validarTextareaSugestoes();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preenche o campo nome>")
    public void que_o_usuário_não_preenche_o_campo_nome() {
        componentes.testarTextfieldSobrenome();
        componentes.testarRadioButtonSexo();
        componentes.testarBotaoCadastrar();
    }

    @Então("deve ser exibida uma mensagem O campo Nome é obrigatório! indicando que os campos são obrigatórios")
    public void deve_ser_exibida_uma_mensagem_O_campo_Nome_é_obrigatório_indicando_que_os_campos_são_obrigatórios() {
        componentes.validarNomeObrigatorio();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preenche o campo sobrenome>")
    public void que_o_usuário_não_preenche_o_campo_sobrenome() {
        componentes.testarTextfieldNome();
        componentes.testarRadioButtonSexo();
        componentes.testarBotaoCadastrar();
    }

    @Então("deve ser exibida uma mensagem O campo Sobrenome é obrigatório! indicando que os campos são obrigatórios")
    public void deve_ser_exibida_uma_mensagem_O_campo_Sobrenome_é_obrigatório_indicando_que_os_campos_são_obrigatórios() {
        componentes.validarSobrenomeObrigatorio();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preenche o campo sexo>")
    public void que_o_usuário_não_preenche_o_campo_sexo() {
        componentes.testarTextfieldNome();
        componentes.testarTextfieldSobrenome();
        componentes.testarBotaoCadastrar();
    }

    @Então("deve ser exibida uma mensagem O campo Sexo é obrigatório! indicando que os campos são obrigatórios")
    public void deve_ser_exibida_uma_mensagem_O_campo_Sexo_é_obrigatório_indicando_que_os_campos_são_obrigatórios() {
        componentes.validarSexoObrigatorio();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preenche o campo nome e sobrenome>")
    public void que_o_usuário_não_preenche_o_campo_nome_e_sobrenome() {
        componentes.testarRadioButtonSexo();
    }

    @Então("deve ser exibida uma mensagem Os campos Nome e Sobrenome são obrigatórios indicando que os campos são obrigatórios")
    public void deve_ser_exibida_uma_mensagem_Os_campos_Nome_e_Sobrenome_são_obrigatórios_indicando_que_os_campos_são_obrigatórios() {
        componentes.validarNomeObrigatorio();
        componentes.validarSobrenomeObrigatorio();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preenche o campo nome e sexo>")
    public void que_o_usuário_não_preenche_o_campo_nome_e_sexo() {
        componentes.testarTextfieldSobrenome();
    }

    @Então("deve ser exibida uma mensagem Os campos Nome e Sexo são obrigatórios indicando que os campos são obrigatórios")
    public void deve_ser_exibida_uma_mensagem_Os_campos_Nome_e_Sexo_são_obrigatórios_indicando_que_os_campos_são_obrigatórios() {
        componentes.validarNomeObrigatorio();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preenche o campo sexo e sobrenome>")
    public void que_o_usuário_não_preenche_o_campo_sexo_e_sobrenome() {
        componentes.validarNomeObrigatorio();
    }

    @Então("deve ser exibida uma mensagem Os campos Sexo e Sobrenome são obrigatórios indicando que os campos são obrigatórios")
    public void deve_ser_exibida_uma_mensagem_Os_campos_Sexo_e_Sobrenome_são_obrigatórios_indicando_que_os_campos_são_obrigatórios() {
        componentes.validarSexoObrigatorio();
        componentes.validarSobrenomeObrigatorio();
        componentes.fecharNavegador();
    }

}

