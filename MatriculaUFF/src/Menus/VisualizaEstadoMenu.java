package Menus;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */

public class VisualizaEstadoMenu extends EstadoMenuAbstrato {

    public VisualizaEstadoMenu(){
	this.setMsg("--------------------------------\n" +
	"Bem-vindo ao MatrículaUFF:\n" +
	"Digite a opção desejada:\n"+
	"[1]: Visualizar Informações Pessoais\n" +
	"[2]: Visualizar Disciplinas e carga horária\n" +
	"[3]: Visualizar Plano de Estudo" +
	"[4]: Visualizar Histórico" +
	"[5]: Visualizar Mensagens Recebidas" +
	"[6]: Visualizar Mensagens Enviadas" +
	"[7]: Visualizar Contatos" +
	"[8]: Encerrar" +
	"--------------------------------");
    }

    public boolean selecionaOpcao(int opt){
        Scanner scanner = new Scanner(System.in);

        switch(opt){
            case 1:
                //pergunta login
                //pergunta senha
                //se der certo temos que guardar o usuario e ir para o proximo estado proximoEstadoMenu(proximo)
                // se não der certo proximoEstadoMenu(this)
                System.out.println("Digite o login: ");
                String login = scanner.nextLine();
                System.out.println("Digite a senha: ");
                String senha = scanner.nextLine();
                this.getSistema().setUsuarioLogado(this.getSistema().logarSistema(senha, senha));
                break;
            case 2:
                proximoEstadoMenu(new FinalizaEstadoMenu());
            default:
                proximoEstadoMenu(this);
                return false;
            }
        return true;
    }


}
